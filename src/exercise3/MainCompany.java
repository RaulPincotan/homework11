package exercise3;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company();

        company.employ(new Person("Raul Adrian", 29, "carpenter"));
        company.employ(new Person("Raul Pincotan", 37, "welder"));
        company.employ(new Person("Popescu ion", 49, "manager"));
        company.employ(new Person("Popescu Stefan", 29, "carpenter"));
        company.employ(new Person("Ardelean Vasile", 41, "plummer"));
        company.employ(new Person("Ardelean Ion", 31, "welder"));
        company.employ(new Person("Pop Dan", 27, "plummer"));

        System.out.println(company.getManager());
        System.out.println(company.getPerson("Popescu"));
        System.out.println(company.getPersons("carpenterw"));
        System.out.println(company.getPersonsOlder(30));
    }
}
