    package EndOfTheYearSale;

    import java.util.List;
    import java.util.Optional;

    public class YearEndSale {



        public static void main(String[] args) {

            List<StoreItems> listofItems = List.of(new StoreItems("T-shirt",2,6),
                    new StoreItems("Jeans",45,7));
            

            Optional<StoreItems> leastExpensive =  StoreItems.findLeastExpensive(listofItems);

            if(leastExpensive.isPresent()){
                System.out.println("Least expensive is "+ leastExpensive.get());
            }


        }
    }
