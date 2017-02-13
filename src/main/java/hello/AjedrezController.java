package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajedrez.AjedrezEnum;
import com.ajedrez.dto.ResponseDTO;
import com.google.gson.Gson;

@RestController
public class AjedrezController {

	private static final String OK = "OK";
	private static final String FORBIDDEN = "FORBIDDEN";

	@RequestMapping(value = "/move/{ficha}/{initPosX}/{initPosY}/{futPosX}/{futPosY}")
	public String moverFicha(@PathVariable String ficha, @PathVariable int initPosX, @PathVariable int initPosY,
			@PathVariable int futPosX, @PathVariable int futPosY, HttpServletRequest request,
			HttpServletResponse response) {
		Gson gson = new Gson();
		AjedrezEnum f = AjedrezEnum.getFicha(ficha);

		ResponseDTO respuesta = new ResponseDTO();
		if (f == null) {
			return gson.toJson("Ficha no valida");
		}
		if (initPosX < 0 || initPosX > 7 || initPosY < 0 || initPosY > 7) {
			return gson.toJson("posicion inicial no valida");
		}
		if (futPosX < 0 || futPosX > 7 || futPosY < 0 || futPosY > 7) {
			return gson.toJson("posicion futura no valida") ;
		}

		respuesta.setFichaName(ficha);
		boolean validarMovimiento = f.getFicha().validarMovimiento(initPosX, initPosY, futPosX, futPosY);
		if (validarMovimiento) {
			int[] newPosition = f.getFicha().moverFicha(initPosX, initPosY, futPosX, futPosY);
			respuesta.setStatus(HttpServletResponse.SC_OK);
			respuesta.setResponse(OK);
			respuesta.setNewPosX(newPosition[0]);
			respuesta.setNewPosY(newPosition[1]);

		} else {
			respuesta.setPosiblePositions(f.getFicha().posiblesPosiciones(initPosX, initPosY));
			respuesta.setResponse(FORBIDDEN);
			respuesta.setStatus(HttpServletResponse.SC_FORBIDDEN);
//			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			respuesta.setNewPosX(futPosX);
			respuesta.setNewPosY(futPosY);
		}

		return gson.toJson(respuesta);

	}

}
