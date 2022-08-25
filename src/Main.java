public class Main {
    public static void main(String[] args) {
        //Task 1
        int dog = 8;
        var cat = 3.6;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        double dog2 = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog2);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Task 6
        double boxerMaxim = 78.2;
        double boxerDinar = 82.7;
        double boxersWeight = boxerMaxim + boxerDinar;
        System.out.println("Вес обоих боксёров " + boxersWeight + " кг");
        double boxersWeightDifference = boxerDinar - boxerMaxim;
        System.out.println("Разница в весе у боксёров " + boxersWeightDifference + " кг");

        //Task 7
        double boxersWeightDifferenc2 = boxerDinar - boxerMaxim;
        System.out.println("Разница в весе у боксёров " + boxersWeightDifference + " кг");
        double boxersWeightDifference3 = boxerDinar % boxerMaxim;
        System.out.println("Разница в весе у боксеров " + boxersWeightDifference3 + " кг");

        //Task 8
        var workHours = 640;
        var hoursPerDay = 8;
        var coworkersNumber = workHours / hoursPerDay;
        System.out.println("Всего работников в компании " + coworkersNumber + " человек");
        var coworkersNumber2 = coworkersNumber + 94;
        var workHours2 = hoursPerDay * coworkersNumber2;
        System.out.println("Если в компании работает " + coworkersNumber2 + " человек, то всего " + workHours2 + " часов работы может быть поделено между сотрудниками");





    }
}