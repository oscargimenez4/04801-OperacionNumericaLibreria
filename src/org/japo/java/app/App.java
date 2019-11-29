/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public final class App {

    //Constantes
    public static final int N1;
    public static final int N2;

    //Static
    static {
        //Random
        final Random RND = new Random();
        //Limites
        final int MIN = 1;
        final int MAX = 10;
        N1 = RND.nextInt(MAX - MIN + 1) + MIN;
        N2 = RND.nextInt(MAX - MIN + 1) + MIN;
    }

    public final void launchApp() {
        //Cabecera
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        //Muestra numeros
        System.out.printf("Número 1 .....:%d%n", N1);
        System.out.printf("Número 2 .....:%d%n", N2);
        //salto de linea
        System.out.println("---");
        //Calculo
        int mayor = (int) UtilesPrimitivos.operar(
                N1, N2, UtilesPrimitivos.OP_MAY);
        //mensaje final
        System.out.printf("El MAYOR es .: %d%n", mayor);
    }
}
