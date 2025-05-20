package lecture2;

public class DogProblemBeautifulSolution {
    public  static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;

        for (int i = 0; i < dogs.length; i+=1) {
            if (isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }
        returnDogs = arrayWithNoNulls(returnDogs, cnt)
    }
}
