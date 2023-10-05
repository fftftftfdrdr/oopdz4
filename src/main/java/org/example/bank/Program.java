package org.example.bank;



public class Program {

    public static void main(String[] args) {

        //Account<Person> account1 = new Account<>(new Person("AA", "BB"), 20000);

        Entity entity1 = new Entity("ООО Рога и копыта", "2220001");
        Person person1 = new Person("Клиент1", "5554442");
        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity1, 1500000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 300);


        Transaction<Account> transaction = new Transaction<>(debetAccount1, creditAccount1, 35000);
        transaction.execute();

        transaction.execute();


    }

}
