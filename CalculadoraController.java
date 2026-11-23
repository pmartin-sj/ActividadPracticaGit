import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {
    @GetMapping("/calcular")
    public String calcular(
        @RequestParam double num1,
        @RequestParam double num2, 
        @RequestParam String operacion
    ) {
        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "potencia":
                resultado = Math.pow(num1, num2);
                break;
        }

        return resultado;
    }
}