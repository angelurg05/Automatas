package RFC;

public class Metodos {

    public void VerificacionLetras(String rfc[]) {
        int vl = 0;
        String abecedari = "ABCDEFGHIJKLNMÑOPQRSTUVWXYZ";
        String tabc[] = abecedari.split("");
        for (int i = 0; i < tabc.length; i++) {
            if (rfc[0].equals(tabc[i])) {
                i = 26;
                vl++;
            }
        }
        if (vl != 0) {
            for (int i = 0; i < tabc.length; i++) {
                if (rfc[1].equals(tabc[i])) {
                    i = 26;
                    vl++;
                }
            }
            if (vl != 1) {
                for (int i = 0; i < tabc.length; i++) {
                    if (rfc[2].equals(tabc[i])) {
                        i = 26;
                        vl++;
                    }
                }
                if (vl != 2) {
                    for (int i = 0; i < tabc.length; i++) {
                        if (rfc[3].equals(tabc[i])) {
                            i = 26;
                            vl++;
                        }
                    }
                    if (vl != 3) {
                        //Verificar Numeros
                        verificarnumeros(rfc);
                    } else {
                        System.out.println("\033[41mEl RFC no es valido");
                    }
                } else {
                    System.out.println("\033[41mEl RFC no es valido");
                }
            } else {
                System.out.println("\033[41mEl RFC no es valido");
            }
        } else {
            System.out.println("\033[41mEl RFC no es valido");
        }
    }

    public void verificarnumeros(String rfc[]) {
        int vn = 0;
        String numeros = "1234567890";
        String tnum[] = numeros.split("");
        for (int i = 0; i < tnum.length; i++) {
            if (rfc[4].equals(tnum[i])) {
                i = 9;
                vn++;
            }
        }
        if (vn != 0) {
            for (int i = 0; i < tnum.length; i++) {
                if (rfc[5].equals(tnum[i])) {
                    i = 9;
                    vn++;
                }
            }
            if (vn != 1) {
                for (int i = 0; i < tnum.length; i++) {
                    if (rfc[6].equals(tnum[i])) {
                        i = 9;
                        vn++;
                    }
                }
                if (vn != 2) {
                    for (int i = 0; i < tnum.length; i++) {
                        if (rfc[7].equals(tnum[i])) {
                            i = 9;
                            vn++;
                        }
                    }
                    if (vn != 3) {
                        for (int i = 0; i < tnum.length; i++) {
                            if (rfc[8].equals(tnum[i])) {
                                i = 9;
                                vn++;
                            }
                        }
                        if (vn != 4) {
                            for (int i = 0; i < tnum.length; i++) {
                                if (rfc[9].equals(tnum[i])) {
                                    i = 9;
                                    vn++;
                                }
                            }
                            if (vn != 5) {
                                //homoclave
                                homoclave(rfc);
                            } else {
                                System.out.println("\033[41mEl RFC no es valido");
                            }
                        } else {
                            System.out.println("\033[41mEl RFC no es valido");
                        }
                    } else {
                        System.out.println("\033[41mEl RFC no es valido");
                    }
                } else {
                    System.out.println("\033[41mEl RFC no es valido");
                }
            } else {
                System.out.println("\033[41mEl RFC no es valido");
            }
        } else {
            System.out.println("\033[41mEl RFC no es valido");
        }
    }

    public void homoclave(String rfc[]) {
        int nh = 0;
        String numabc = "ABCDEFGHIJKLNMÑOPQRSTUVWXYZ1234567890";
        String na[] = numabc.split("");
        for (int i = 0; i < na.length; i++) {
            if (rfc[10].equals(na[i])) {
                i = na.length - 1;
                nh++;
            }
        }
        if (nh != 0) {
            for (int i = 0; i < na.length; i++) {
                if (rfc[11].equals(na[i])) {
                    i = na.length - 1;
                    nh++;
                }
            }
            if (nh != 1) {
                for (int i = 0; i < na.length; i++) {
                    if (rfc[12].equals(na[i])) {
                        i = na.length - 1;
                        nh++;
                    }
                }
                if(nh!=2){
                    System.out.println("\033[42mRFC Aceptada");
                }else{
                    System.out.println("\033[41mEl RFC no es valido");
                }
            } else {
                System.out.println("\033[41mEl RFC no es valido");
            }
        } else {
            System.out.println("\033[41mEl RFC no es valido");
        }
    }
}
