import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket1 {
    public void getSortedList() {
        List<String> names = new ArrayList<>(Arrays.asList("1first", "2asecond", "3bthird"));
        System.out.println(names);

        List<String> namesNew = new ArrayList<>();
        for (int i = 0; i < names.size() ; i++){
            namesNew.add (names.get(i).substring(1));
        }

        namesNew = namesNew
                .stream()
                .sorted()
                .toList();

        System.out.println(namesNew);
    }
}
