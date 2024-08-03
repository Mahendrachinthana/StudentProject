package EncapsulationRePractice;

class PersonDetailsMain {
    public static void main(String[] args) {
    	ParsonDitailes1  person = new ParsonDitailes1 ();
        person.setName("Mahi");
        person.setNum(9390317606L);
        person.setMail("mahendrachinthanaboina@gmail.com");
        person.setAddress("Sankavaram(village), Vinjamur(mandal), Nellore(dist)");

        String name = person.getName();
        long num = person.getNum();
        String mail = person.getMail();
        String address = person.getAddress();

        System.out.println(name);
        System.out.println(num);
        System.out.println(mail);
        System.out.println(address);
        System.out.println("Name: " + name);
        System.out.println("Number: " + num);
        System.out.println("Mail: " + mail);
        System.out.println("Address: " + address);
    }
}
