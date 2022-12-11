/*public class BeefCowComparator implements Comparator<BeefCow> {
    @Override
    public int compare(BeefCow cow1, BeefCow cow2) {
        int pedigreeComparison = cow1.getPedigree().compareTo(cow2.getPedigree());
        if (pedigreeComparison != 0) {
            return pedigreeComparison;
        }
        int weightComparison = cow1.getWeight() - cow2.getWeight();
        if (weightComparison != 0) {
            return weightComparison;
        }
        return cow1.getAge() - cow2.getAge();
    }
} */
