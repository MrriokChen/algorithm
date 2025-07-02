public class HIndex {
    public int hIndex(int[] citations) {
        int [] hScore = new int [1005];
        int hMax = 0, h = 0;
        for(int i = 0; i< citations.length; i++) {
            hScore[citations[i]]+=1;
            if(citations[i] > hMax) hMax = citations[i];
        }
        for(int i = hMax; i > 0; i--) {
            hScore[i] += hScore[i+1];
            if(hScore[i] > h && i >= h) h = Math.min(hScore[i],i);
        }
        return h;
    }
    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.hIndex(new int[]{0,1,3,5,6}));
    }
}
