    package Students;

    import java.util.List;
    import java.util.Map;

    public class StudentsEnroll {

        private static void findStudentsWithIncompleteVolunteerEvents(List<String> students, Map<String, List<String>> attendesMap) {

           // List<String>
            for(int i =0;i <students.size();i++){
                if (!attendesMap.containsValue(students.get(i))) {
                    System.out.println(students.get(i));
                }
            }


            //return ;
        }

        public static void main(String[] args) {
            List<String> students = List.of("chery","jacob","vtsula","Tony","Holly");

           Map<String,List<String>> attendesMap = Map.of("Car Wash" , List.of("Jolly","Holly","Moly","vtsula"),"Cooking",List.of("Holly","Jacob","Tony")
                   ,"Breakfast" ,List.of("jacob","chery","tony"));



             findStudentsWithIncompleteVolunteerEvents(students,attendesMap);

        }


    }
