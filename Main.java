//Chanchakorn Jullapech
//672115007
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        CovidVaccine student1 = new CovidVaccine(1, "Chanchakorn", "Jullapech", new String[] { "Pfizer", "Moderna" });
        list.insert(student1);
        CovidVaccine student2 = new CovidVaccine(2, "Josh", "Seki", new String[] { "AstraZeneca", "Moderna" });
        list.insert(student2);
        CovidVaccine student3 = new CovidVaccine(3, "Shoto", "TheRogue", new String[] { "Sinovac", "Moderna" });
        list.insert(student3);
        CovidVaccine student4 = new CovidVaccine(4, "Shu", "Yamino", new String[] { "Sinovac", "Moderna" });
        list.insert(student4);
        CovidVaccine student5 = new CovidVaccine(5, "Lian", "Xie", new String[] { "Pfizer", "Sinovac" });
        list.insert(student5);
        CovidVaccine student6 = new CovidVaccine(6, "Cheng", "Hua", new String[] { "Pfizer", "Sinovac" });
        list.insert(student6);
        CovidVaccine student7 = new CovidVaccine(7, "Zephyr", "Euthalia", new String[] { "AstraZeneca", "Moderna" });
        list.insert(student7);
        CovidVaccine student8 = new CovidVaccine(8, "Sonny", "Brisko", new String[] { "AstraZeneca", "Moderna" });
        list.insert(student8);
        CovidVaccine student9 = new CovidVaccine(9, "Uki", "Violeta", new String[] { "AstraZeneca", "Moderna" });
        list.insert(student9);
        CovidVaccine student10 = new CovidVaccine(10, "Yejun", "Nam", new String[] { "AstraZeneca", "Moderna" });
        list.insert(student10);

        list.traversal();

  
        Random random = new Random();
        int randomSID = random.nextInt(10) + 1;
            list.delete(randomSID);
        int randomSID2 = random.nextInt(10) + 1;
            list.delete(randomSID2);

       
        list.traversal();

        
        list.deleteAll();

        
        list.traversal();
    }
}

