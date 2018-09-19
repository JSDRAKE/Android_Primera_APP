package ar.com.jsdrake.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.util.resources.cldr.asa.CalendarData_asa_TZ;

public class POO {
    public static void main(String[] args) {
        Casa miCasa = new Casa( "Independencia", 'd', (short)34, 2000000,
                1104537600000L, 3.5f, 320.3453454543543,
                false );

        System.out.println(miCasa);

        Casa maryCasa = new Casa ("Reforma", (short) 543, 3500000, true);
        Casa claudiaCasaa = new Casa("Roma", (short)12, 1200000, false);

        System.out.println(maryCasa);


        Main.nuevoTema("Listas");

        List<Casa> casaList = new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(maryCasa);
        casaList.add(claudiaCasaa);

        casaList.remove(1);
        casaList.set(1, miCasa);

        for (Casa currentCasa : casaList){
            System.out.println(currentCasa);
        }
        Main.nuevoTema("Diccionarios");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("Jorge", miCasa);
        casaMap.put("Mary", maryCasa);
        casaMap.put("Claudia", claudiaCasaa);

        System.out.println(casaMap.size());
        casaMap.remove("Jorge");
        System.out.println(casaMap.size());

        casaMap.put("Mary", claudiaCasaa);
        System.out.println(casaMap.get("Mary"));

        Main.nuevoTema("Herencia");
        Apartamento apartamentoPlaya = new Apartamento("Malecon", 'b', (short) 101,
                2600000, 1009843200000L, 6.3f, 180.434354354, true, (short)5 );

        System.out.println(apartamentoPlaya);

        Main.nuevoTema("Polimorfismo");
        venderPropiedades(miCasa);
        venderPropiedades(apartamentoPlaya);

        Casa apartamentoCiudad = new Apartamento("Principal", 'F', (short) 913,
                1950000, 1009843200000L, 4.35f, 145.654, false,
                (short) 2);
        venderPropiedades(apartamentoCiudad);
        Casa casaNueva = new Casa();
        casaNueva.setCalle("Cortez");
        casaNueva.setHipotecada(true);
        casaNueva.setImpuesto(2.1f);
        System.out.println(casaNueva);
        venderPropiedades(casaNueva);

        Main.nuevoTema("Equal y hasCode");
        Casa miSegundaCasa = new Casa( "Independencia", 'd', (short)34, 2000000,
                1104537600000L, 3.5f, 320.3453454543543,
                false);
        System.out.println(miCasa.equals(miSegundaCasa));

        Casa miTerceraCasa = new Casa();
        System.out.println(casaMap.containsValue(claudiaCasaa));

    }

    private static void venderPropiedades(Casa casa) {
        if (casa.isHipotecada()){
            System.out.println("Imposible Vender!!!");
        }
        else {
            System.out.println("En venta");
        }
    }
}
