import java.util.Scanner;


public class Main{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int total = 0;
        Caja dinero = new Caja(total);


        Localidad L1 = new Localidad("lejana", 100, 250);
        Localidad L2 = new Localidad("media", 100, 575);
        Localidad L3 = new Localidad("cercana", 100, 1720);

        int menu = 0;
        while(menu<1)
        {
            System.out.println("Si desea comprar tickets presione 1");
            System.out.println("Si desea acceder a caja presione 2");
            System.out.println("Si desea salir del menú presione 3");
            int opc = sc.nextInt();

            if (opc == 1)
            {
                numero = numero + 1;
                System.out.println("ha escogido comprar tickets");
                System.out.println("Ingrese su nombre");

                String nombre = sc.next();

                System.out.println("Ingrese su número de teléfeno");

                int telefono = sc.nextInt();

                System.out.println("Ingrese su presupuesto");

                int presupuesto = sc.nextInt();

                System.out.println("Ingrese la cantidad de tickets que desea comprar (máximo por persona 6)");

                int cantidad = sc.nextInt();


                Usuario x = new Usuario(nombre, telefono, presupuesto, cantidad);


                int local = 0;
                while (local<1) {
                    System.out.println("Ingrese la localidad en la que desea comprar lugares:");
                    System.out.println("Ingrese 1 si desea la localidad");
                    System.out.println("Ingrese 2 si desea la localidad");
                    System.out.println("Ingrese 3 si desea la localidad");
                    int loc = sc.nextInt();
                    if (loc == 1) {

                        if (L1.getCapacidad() >= x.getCantidad()) {

                            int precio_total = (x.getCantidad() * L1.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L1.setCapacidad(L1.getCapacidad() - x.getCantidad());
                            }


                        } else {
                            int precio_total = (L1.getCapacidad() * L1.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L1.setCapacidad(L1.getCapacidad() - x.getCantidad());
                            }
                        }
                        local = local +1;

                    }

                    if (loc == 2) {
                        if (L2.getCapacidad() >= x.getCantidad()) {

                            int precio_total = (x.getCantidad() * L2.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L2.setCapacidad(L2.getCapacidad() - x.getCantidad());
                            }


                        } else {
                            int precio_total = (L2.getCapacidad() * L2.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L2.setCapacidad(L2.getCapacidad() - x.getCantidad());
                            }
                        }
                        local = local +1;

                    }

                    if (loc == 3) {
                        if (L3.getCapacidad() >= x.getCantidad()) {

                            int precio_total = (x.getCantidad() * L3.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L3.setCapacidad(L3.getCapacidad() - x.getCantidad());
                            }


                        } else {
                            int precio_total = (L3.getCapacidad() * L3.getPrecio());

                            if (x.getPresupuesto() < precio_total) {
                                System.out.println("Su presupuesto no es suficiente para comprar esta cantidad de tickets");
                            } else {
                                int cambio = (x.getPresupuesto() - precio_total);
                                System.out.println("Su cambio es de: " + cambio);
                                dinero.setTotal(dinero.getTotal() + precio_total);
                                L3.setCapacidad(L3.getCapacidad() - x.getCantidad());
                            }
                        }
                        local = local +1;

                    }
                    else {
                        System.out.println("Opción no válida");

                    }
                    //Aquí se generará el ticket
                }

            }

            if (opc == 2)
            {
                System.out.println("El dinero total en caja es de" + dinero.getTotal());

            }
            if (opc == 3)
            {
                System.out.println("Gracias por utilizar el programa.");
                menu = menu + 1;
            }

            else{
                System.out.println("Opción no válida");
            }

        }

    }

}
