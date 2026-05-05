public class Fisch implements Prey, Predator{
        @Override
        public void flee() {
            System.out.println("*The fisch is swimming away*");
        }
        @Override
        public void hunt() {
            System.out.println("*The fisch is hunting*");
        }
    }
