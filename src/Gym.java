public class Gym {

        Integer GymLevelCost=10;
        String name;
        Integer membershipLevel;

        public Gym(String name, Integer membershipLevel) {

            this.name = name;
            this.membershipLevel = membershipLevel;


        }
        public Integer calcDues(Integer level){
            return  level * GymLevelCost;
        }
    }

