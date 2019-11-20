/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constantes
        final double DINERO_INI = 2;
        final double PRECIO_PEL = 1.3;
        final double PRECIO_PAL = 0.9;

        //Variables
        double gastPal;
        double gastTot;
        double dinRest;

        //Operaciones
        gastPal = PRECIO_PAL / 2;
        gastTot = gastPal + PRECIO_PEL;
        dinRest = DINERO_INI - gastTot;

        //Mensaje
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Dinero inicial .....:",
                DINERO_INI);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Precio película ....:",
                PRECIO_PEL);

        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Parte palomitas ....:",
                gastPal);

        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Gastos por persona .:",
                gastTot);

        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Dinero restante ....:",
                dinRest);

    }

}
