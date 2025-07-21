import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.annotations.SerializedName;

public class InterfasGrafica {
    /* creamos metodos para minimizar codigo */

    public void cabeseraInterfase ( String borde, String titulo, String subtitulo){
        System.out.println(borde);
        System.out.println(" ");
        System.out.println(titulo);
        System.out.println(" ");
        System.out.println(subtitulo);

    }


public void opcionMonedas( ){
    System.out.println("""
                1 Peso Argentino
                2 Peso Chileno
                3 Peso Mexicano
                4 Real Brazileño
                5 Dollar Americano
                6 Dollar Canadiense
                7 Euro """);
}

    ArrayList<Moneda>listaMonedas=new ArrayList<>();

    public ArrayList<Moneda> getListaMonedas() {
        return listaMonedas;
    }


/* -------------------------------------------------------------------------------------------------------------------------------*/
    /*     metodo opcionDelClinete1 pide opcion de moneda y monto  ,crea el objeto moneda1 y lo guarda en una lista listaMonedas  */

    public void opcionDelCliente1(int opcionCliente, double monto){
    switch(opcionCliente){
        case 1:
            Moneda moneda1 = new Moneda("Peso Argentino","ARS","ARGENTINA",monto);
            listaMonedas.add(moneda1);
            System.out.println(listaMonedas.get(0));
            break;
        case 2:
            Moneda moneda2 = new Moneda("Peso Chileno","CLP","CLILE",monto);
            listaMonedas.add(moneda2);
            System.out.println(listaMonedas.get(0));
            break;
        case 3:
            Moneda moneda3 = new Moneda("Peso Mexicano","MXN","MEXICO",monto);
            listaMonedas.add(moneda3);
            System.out.println(listaMonedas.get(0));
            break;
        case 4:
            Moneda moneda4 = new Moneda("RealBrazileño","BRL","BRAZIL",monto);
            listaMonedas.add(moneda4);
            System.out.println(listaMonedas.get(0));
            break;
        case 5:
            Moneda moneda5 = new Moneda("Dollar Americano","USD","USA",monto);
            listaMonedas.add(moneda5);
            System.out.println(listaMonedas.get(0));
            break;
        case 6:
            Moneda moneda6 = new Moneda("Dollar Canadience","CAD","CANADA",monto);
            listaMonedas.add(moneda6);
            System.out.println(listaMonedas.get(0));
            break;
        case 7:
            Moneda moneda7 = new Moneda("Euro","EUR","Europa",monto);
            listaMonedas.add(moneda7);
            System.out.println(listaMonedas.get(0));
            break;
        case 8:
            if (opcionCliente!=7){
                System.out.println("Ingresa una opcion valida");
            }
            break;
    }
}

/* --------------------------------------------------------------------------------------------------------------------------------*/
/*     metodo opcionDelClinete2 pide opcion de moneda ,crea el objeto moneda2 y lo guarda en una lista listaMonedas  */

    public void opcionDelCliente2(int opcionCliente ){
        switch(opcionCliente){
            case 1:
                Moneda moneda1 = new Moneda("Peso Argentino","ARS","ARGENTINA",0);
                listaMonedas.add(moneda1);
                System.out.println( "Moneda de origen : ./n"+listaMonedas.get(0)+"/n.Moneda de destino : "+listaMonedas.get(1));
                break;
            case 2:
                Moneda moneda2 = new Moneda("Peso Chileno","CLP","CHILE",0);
                listaMonedas.add(moneda2);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 3:
                Moneda moneda3 = new Moneda("Peso Mexicano","MXN","MEXICO",0);
                listaMonedas.add(moneda3);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 4:
                Moneda moneda4 = new Moneda("RealBrazileño","BRL","BRAZIL",0);
                listaMonedas.add(moneda4);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 5:
                Moneda moneda5 = new Moneda("Dollar Americano","USD","USA",0);
                listaMonedas.add(moneda5);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 6:
                Moneda moneda6 = new Moneda("Dollar Canadience","CAD","CANADA",0);
                listaMonedas.add(moneda6);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 7:
                Moneda moneda7 = new Moneda("Euro","EUR","Europa",0);
                listaMonedas.add(moneda7);
                System.out.println( "Moneda de origen : "+listaMonedas.get(0));
                System.out.println("Moneda de destino : "+listaMonedas.get(1));
                break;
            case 8:
                if (opcionCliente!=7){
                    System.out.println("Ingresa una opcion valida");

                }
                break;
        }
    }

/* --------------------------------------------------------------------------------------------------------------------------*/

public String solicitudApi(String monedaVase,String monedaDestino){
        String direccion = "https://v6.exchangerate-api.com/v6/98c9f758ea23934dfd90805d/pair/"+monedaVase+"/"+monedaDestino;
        return direccion;
    }
/*-------------------------------------------------------------------------------------------------------------------------- */

    public void resultado(double valor1,double valor2 ){
        double total =valor1*valor2;
        String resultadoFinal = String.format("%.2f",total );
        System.out.println(resultadoFinal);
    }
/* *******************************************************************************************************************************/

    public static void main(String[] args) throws IOException, InterruptedException {
        /* VARIABLES DEL  MAIN*/
        String titulo= "Bienvenido al sistema de intercambio de monedas";
        String subtitulo= "Seleccione la moneda de su preferencia ";
        String opcionDeTitulo = " ";/* se usa para ingresar mensajes segun la vuelta de bucle*/
        String mensajeSalida = " Gracias por su operacion ";
        String borde ="******************************************************************************************";
        int terminarPrograma = 1;
/*--------------------------------------------------------------------*/
        /*Utilizamos un bucle while para tener una opcion de cierre del programa  */
        while ( terminarPrograma==1){
            /*  muestra titulo subtitulo y opciones de moneda */
            InterfasGrafica miInterfas = new InterfasGrafica();
            miInterfas.cabeseraInterfase(borde,titulo,subtitulo);
            miInterfas.opcionMonedas();
            System.out.println(borde);
            /*---------------------------------------------------------------- */
            /* solicita  numero opcion y retorna objeto moneda */
            Scanner ingresoPorTeclado = new Scanner(System.in);
            opcionDeTitulo = "Seleccione  la opcion de su moneda inicial :";
            System.out.println(opcionDeTitulo);
            var opcionNumero= ingresoPorTeclado.nextInt();
            opcionDeTitulo="Ingrese la cantidad :";
            System.out.println(opcionDeTitulo);
            double opcionMonto=ingresoPorTeclado.nextDouble();
            miInterfas.opcionDelCliente1(opcionNumero,opcionMonto);

            /* -------------------------------------------------------------------*/
            /*Solicita segunda opcion retorna segundo objeto moneda */
                    miInterfas.cabeseraInterfase(borde,"Moneda de destino",subtitulo);
            miInterfas.opcionMonedas();
            opcionDeTitulo= "Seleccione su opcion de destino :  ";
            System.out.println(opcionDeTitulo);
            int cambio=ingresoPorTeclado.nextInt();
            miInterfas.opcionDelCliente2(cambio);
            /*System.out.println(mensajeSalida);*/
            /*  ------------------------------------------------------------------------------*/
            /* Construir la direccion con los end point*/
            /* crea el punto de inicio*/
            ArrayList<Moneda> monedaEnPosision0=miInterfas.getListaMonedas();
            Moneda puntoInicio = monedaEnPosision0.get(0);
            String puntoVase = puntoInicio.getCodigo();
            /* Extrae de arraraylit ListaMonedas el atributo codigo  */

            /*--------------------------------------------------------------------------------- */
            /* crea la  punto final de solicitud  API */
            ArrayList<Moneda> monedaEnPosision1=miInterfas.getListaMonedas();
            Moneda puntoFinal =monedaEnPosision1.get(1);
            String puntoDestino= puntoFinal.getCodigo();
            /* Extrae de arraraylit ListaMonedas el atributo codigo  */
            /* estos bloques se dedica a referenciar objetos  de la clase Moneda y la lista listaMonedas*/
            /* nota para mi yo del futuro actualmente no se como hacer referencia a un objeto*/

            /* ----------------------------------------------------------------------------------------------------*/
            /* crea solicitud http */
            String busqueda =miInterfas.solicitudApi(puntoVase,puntoDestino);
            //System.out.println(busqueda);

            /*------------------------------------------------------------------------------*/
            /* solicitud api*/
            Busqueda miBusqueda=new Busqueda();
            double taza= miBusqueda.busqueda1(busqueda);

            /*-------------------------------------------------------------------------------- */
            /*        Convertir valor de moneda vase a moneda de destino                */
            ArrayList<Moneda> monto1=miInterfas.getListaMonedas();
            Moneda puntoFinal1 =monto1.get(0);
            double puntoDestino1= puntoFinal1.getMontoInicial();

            /* -----------------------------------------------------------------------*/
            /* obtener la taza del metodo busqueda */
            ArrayList<Moneda> monto2=miInterfas.getListaMonedas();
            Moneda puntoFinal2 =monto2.get(1);
            puntoFinal2.setTaza(taza);
            double puntoDestino2= puntoFinal2.getTaza();

            /*------------------------------------------------------------------------------------------------ */

            /*   Formatear variable puntoDestino2 para que retorne solo 2 digitos */
            String numeroFormateado1 = String.format("%.2f",puntoDestino1 );
            String numeroFormateado2 = String.format("%.4f",puntoDestino2 );
            /* ------------------------------------------------------------------------------------------------*/

            /* IMPRIME RESULTADOS DE OPERACION*/
            miInterfas.cabeseraInterfase(borde,"Resultados","");
            System.out.println( "Monto inicial: $"+numeroFormateado1);
            System.out.println("Taza de cambio: " +numeroFormateado2);
            System.out.println("Resultado  ");
            miInterfas.resultado(puntoDestino1,puntoDestino2);
            System.out.println("");
            System.out.println(mensajeSalida);;
            System.out.println("");
            System.out.println(borde);
            System.out.println("Desea continuar 1 (si)/2(no) :");
            int opcion2= ingresoPorTeclado.nextInt();
            if (opcion2==1) {terminarPrograma=1;
            }else {
                System.out.println(mensajeSalida);
                terminarPrograma=2;
            }




        }







}}
