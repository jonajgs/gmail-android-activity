package mx.jonathancoder.imail.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mx.jonathancoder.imail.Models.Mail;

public class Util {

    private static String[] colors = new String[]
            {
                    "F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
                    "03A9F4", "009688", "4CAF50", "CDDC39", "FFC107",
                    "FF5722", "795548", "9E9E9E", "455A64", "FF5722"
            };

    public static String getRandomColor() {
        int randomNumber = new Random().nextInt(colors.length) + 0;

        return colors[randomNumber];
    }


    public static List<Mail> getMails() {
        return new ArrayList<Mail>(){{
            add(new Mail("Estado de Cuenta Totalplay", "Estimado JONATHAN DE JESUS GUTIERREZ SOSA\n" +
                    "\n" +
                    "Te informamos que tu Estado de Cuenta con corte al\n" +
                    "14 de agosto de 2017 ya se encuentra disponible.\n" +
                    "\n" +
                    "\n" +
                    "PLAN EMOCIÓN TOTAL\n" +
                    "\n" +
                    "TOTAL A PAGAR\n" +
                    "ANTES DEL 01 de septiembre de 2017\n" +
                    "$459\n" +
                    " \n" +
                    "AHORRA PAGANDO\n" +
                    "CON DESCUENTO POR PRONTO PAGO\n" +
                    "ANTES DEL 24 de agosto de 2017\n" +
                    "$409", "enlacetpe@emailtracking.interfactura.com.mx", "TotalPlay", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
            add(new Mail("Tu compañía CEI ahora puede procesar pagos", "La compañía CEI ha sido activada y se encuentra lista para entrar en producción. \n" +
                    "\n" +
                    "Dentro del panel Conekta Admin en la sección de Api Keys ya puedes encontrar las llaves de producción las cuales deben implementadas en el sitio web o app para poder empezar a procesar cargos reales: https://admin.conekta.com/settings/keys \n" +
                    "\n" +
                    "El nombre que aparecerá en el estado de cuenta de tus clientes sera \"CONEKTA*CEI\" o \"PAGOCON*CEI\" (el nombre de CONEKTA o PAGOCON es obligatorio). \n" +
                    "\n" +
                    "Es muy importante que te informes sobre el riesgo del e-Commerce en México, te recomiendo revisar nuestra guía de contracargos en https://www.conekta.com/es/guias/contracargos/introduccion \n" +
                    "\n" +
                    "Si tienes dudas o deseas mayor información sobre contracargos, riesgo, otras cuentas que abrirás próximamente, etc; puedes programar una llamada en https://calendly.com/activacion-conekta/15min", "soporte@conekta.com", "Conekta | Soporte", "luisangeljg@gmail.com"));
        }};
    }
}
