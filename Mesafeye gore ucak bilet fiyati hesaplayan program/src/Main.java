import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int km, age, yon;
        double perKm = 0.10, normalPrice, agePrice, totalPrice,total, gdPrice;

        System.out.print("Mesafeyi Km türünden giriniz :");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();

        System.out.print("Tek yön uçucaksanız : '1' tuşuna \nGidiş-Gönüş uçmak istiyosanız lütfen '2' tuşuna basınız : ");
        yon = input.nextInt();


        if (km > 0 && age > 0) {

            switch (yon) {

                case 1: {
                    if (age <= 12) {

                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.05;
                        totalPrice = normalPrice - agePrice;
                        System.out.println("Toplam ücretiniz :" + totalPrice + "TL");
                        break;
                    } else if (age < 24 && age > 12) {

                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.1;
                        totalPrice = normalPrice - agePrice;
                        System.out.println("Toplam ücretiniz :" + totalPrice + "TL");

                    } else if (age < 65 && age >= 24) {

                        normalPrice = (km * perKm);
                        System.out.println("Toplam ücretiniz :" + normalPrice + "TL");

                    } else {

                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.3;
                        totalPrice = normalPrice - agePrice;
                        System.out.println("Toplam ücretiniz :" + totalPrice + "TL");
                    }
                }
                case 2 : {
                    if (age <= 12) {
                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.5;
                        totalPrice = normalPrice - agePrice;
                        gdPrice = totalPrice * 0.2;
                        total = (totalPrice - gdPrice) * 2;
                        System.out.println("Toplam ücretiniz : " + total + "TL");

                    } else if ((age > 12) && (age <= 24)) {
                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.1;
                        totalPrice = normalPrice - agePrice;
                        gdPrice = totalPrice * 0.2;
                        total = (totalPrice - gdPrice) * 2;
                        System.out.println("Toplam ücretiniz : " + total + "TL");

                    } else if (age < 65) {
                        normalPrice = (km * perKm);
                        gdPrice = normalPrice * 0.2;
                        total = normalPrice - gdPrice;
                        System.out.println("Toplam Ücret : " + total + "TL");

                    } else {
                        normalPrice = (km * perKm);
                        agePrice = normalPrice * 0.3;
                        totalPrice = normalPrice - agePrice;
                        gdPrice = totalPrice * 0.2;
                        total = (totalPrice - gdPrice);
                        System.out.println("Toplam Ücret : " + total + "TL");
                    }

                }
                default : System.out.println("Hatalı Giriş Yaptınız.");
            }
        }   else {
            System.out.println("Geçersiz Değer Girdiniz.");
        }

            }


        }




