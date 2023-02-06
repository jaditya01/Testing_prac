    package EndOfTheYearSale;

    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.Collection;
    import java.util.Comparator;
    import java.util.Optional;

    @Getter
    @Setter
    @AllArgsConstructor
    public class StoreItems {

         String name;
         int price;
         int discount;


        public static Optional<StoreItems> findLeastExpensive(Collection<StoreItems> items) {

            return items.stream().min(Comparator.comparing(StoreItems::calculatecurrentprice));
        }

        private int calculatecurrentprice() {
            return  price -(price*discount);
        }

        @Override
        public String toString() {
            return "StoreItems{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", discount=" + discount +
                    '}';
        }
    }
