/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrador
 */
public class Metodos {

    char[] Codf = new char[1000];

    public char[] CodificarConJ(String palab) {
        int cont = 1;
        int var = 0;
        int i = 0;

        char[] arr = palab.toCharArray();


        while (var < arr.length) {

            if (cont - 1 == i) {

                Codf[i] = 'j';
                cont = cont * 2;
                i++;
            } else {
                if (var <= arr.length) {

                    Codf[i] = arr[var];
                    char temp = Codf[i];
                    var++;
                    i++;
                }
            }

        }


        return Codf;

    }

    public String Binario(int pos) {

        int temp = pos;
        String ret = "";


        while (temp > 0) {
            int z = temp % 2;
            ret = z + ret;
            temp = (temp - z) / 2;

        }
        return ret;
    }

    public String Calcular(char[] charCod) {

        for (int i = 0; i < charCod.length; i++) {
            if (charCod[i] == 'j') {
                String tep = Binario(i + 1);
                char[] conv = tep.toCharArray();
                int posBit = 0;
                int contUnos = 0;
                int contPos = 0;
                for (int j = conv.length - 1; j >= 0; j--) {
                    if (conv[j] == '1') {

                        posBit = j;
                        break;

                    } else {
                        contPos++;
                    }

                }

                for (int jj = i + 1; jj < charCod.length; jj++) {
                    int ss = charCod[jj];
                    if (charCod[jj] != 'j' || charCod[jj] != 0 || charCod[jj] != 1) {

                        String tep2 = Binario(jj + 1);
                        char[] conv2 = tep2.toCharArray();
                        int posBit2 = 0;
                        int ContPos2 = 0;
                        for (int fr = conv2.length - 1; fr >= 0; fr--) {
                            if (conv2[fr] == '1' && contPos == ContPos2) {
                                char nu = charCod[jj];
                                if (nu == '1') {
                                    contUnos++;
                                    break;
                                } else {
                                    break;
                                }

                            } else {
                                ContPos2++;
                            }

                        }


                    }

                }

                if (contUnos % 2 == 0) {

                    charCod[i] = '0';

                } else {
                    charCod[i] = '1';

                }

            }



        }


        String c = " ";
        for (int j = 0; j < charCod.length; j++) {
            if (charCod[j] == '1' || charCod[j] == '0') {
                c = c + charCod[j];
            }

        }
        return c;
    }
}
