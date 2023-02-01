        package Person;

        public class Person {
           int age;
           private String firstName;
           private String lastName;

            public String getFirstName() {
                return this.firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public  Person(String firstName, String lastName, int age){
               this.firstName=firstName;
               this.lastName=lastName;
               this.age=age;
           }

            public int getAge() {
                return this.age;
            }

            public void setAge(int age) {
                if(age<this.age) {
                    System.out.println("you can't make person younger");
                } else  {
                    this.age = age;
                }
            }


            public void IntroduceYourself() {
                System.out.println("The person details are below "+ getFirstName()+ getLastName()+getAge());
            }
        }
