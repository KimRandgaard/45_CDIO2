package Monopoly;

import Monopoly.Fields;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Fields> BoardFields;

    public Board() {
        BoardFields = new ArrayList<Fields>();

        BoardFields.add(new Fields("START",300));
        BoardFields.add(new Fields("Tower",250));
        BoardFields.add(new Fields("Crater",-100));
        BoardFields.add(new Fields("Palace Gates",100));
        BoardFields.add(new Fields("Cold Desert",-20));
        BoardFields.add(new Fields("Walled City",100));
        BoardFields.add(new Fields("Monastery",0));
        BoardFields.add(new Fields("Black Cave",-70));
        BoardFields.add(new Fields("Huts In The Mountain",60));
        BoardFields.add(new Fields("The Warewall, You Get A Extra Turn",80));
        BoardFields.add(new Fields("The Pit",-50));
        BoardFields.add(new Fields("Goldmine",650));
        BoardFields.add(new Fields("Iceland",10));
        BoardFields.add(new Fields("You Have a Punkture",-100));
        BoardFields.add(new Fields("Desert",-30));
        BoardFields.add(new Fields("Blue City",75));
        BoardFields.add(new Fields("The Market",-55));
        BoardFields.add(new Fields("Happy Birthday",300));
        BoardFields.add(new Fields("Kindergarden",-90));
        BoardFields.add(new Fields("School",-75));
        BoardFields.add(new Fields("You Got Drunk",-200));
        BoardFields.add(new Fields("Medical",-400));
        BoardFields.add(new Fields("USA",250));
        BoardFields.add(new Fields("You Played Football",-100));
        BoardFields.add(new Fields("Red Light",69));
        BoardFields.add(new Fields("You Won The Lottery",1000));
        BoardFields.add(new Fields("Stopped By The Police",-95));
        BoardFields.add(new Fields("Liberary",100));
        BoardFields.add(new Fields("Date Night",-200));
        BoardFields.add(new Fields("Hometown",85));
        BoardFields.add(new Fields("You Found Some Money On The Street",35));
        BoardFields.add(new Fields("You Got a Kid",-600));
        BoardFields.add(new Fields("Your Car Crashed",-1000));
        BoardFields.add(new Fields("Go To Field Nr. 40",0));
        BoardFields.add(new Fields("Amsterdam",50));
        BoardFields.add(new Fields("Greenland",-30));
        BoardFields.add(new Fields("Wall Street",95));
        BoardFields.add(new Fields("Mexico Boarder",-250));
        BoardFields.add(new Fields("Dubaii",100));
        BoardFields.add(new Fields("Paradise",750));


    }
}









//            1. START +300
//            2. Tower +250
//            3. Crater -100
//            4. Palace gates +100
//            5. Cold Desert -20
//            6. Walled city +180
//            7. Monastery 0
//            8. Black cave -70
//            9. Huts in the mountain +60
//            10. The Werewall +80 (werewolf-wall) men spilleren får en ekstra tur
//            11. The pit -50
//            12. Goldmine +650
//            13. Iceland +10
//            14. You have a Punkture -100
//            15. Dessert -30
//            16. Blue City + 75
//            17. The market - 55
//            18. happy birthday + 300
//            19. Kindergarden - 90
//            20. School - 75
//            21. you got drunk - 200
//            22. Medical - 400
//            23. USA + 250
//            24. you played football - 100
//            25. Red light +69
//            26. You won the lotery + 1000
//            27. Stopped by the police - 95
//            28. Library + 100
//            29. Date night - 200
//            30. Hometown + 85
//            31. you found some money on the street + 35
//            32. You got a kid - 600
//            33. Your car crashed - 1000
//            34. Go to field 40
//            35. Amsterdam +50
//            36. Greenland -30
//            37. Wall street +95
//            38. Mexico Boarder - 250
//            39. Dubaii +100
//            40. Paradise + 750


