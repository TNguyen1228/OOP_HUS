import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class CandidateManager {
    
    private ArrayList<Candidate> candidates;
    
    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }
    
    /*
    readData
    doc du lieu tu file van ban textFile va luu du lieu vao cac bien thanh vien
    */
    public boolean readData(String textFile) {
        try {
                // add code here
            Scanner fileReader=new Scanner(new File(textFile));
            
            
            fileReader.close();
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  
    }
    
    /* 
    getSelectionCandicates 
    tráº£ vá»� danh sÃ¡ch cÃ¡c thÃ­ sinh cÃ³ khá»‘i thi lÃ  selection 
    */
    public ArrayList<Candidate> getSelectionCandicates(String selection) { 
        
        /* Todo */
        
        return null;
    }
    
    /* 
    getPriorityCandidates 
    tráº£ vá»� danh sÃ¡ch thÃ­ sinh Ä‘Æ°á»£c Æ°u tiÃªn (cÃ³ Ä‘á»™ Æ°u tiÃªn báº±ng 1)
    */
    public ArrayList<Candidate> getPriorityCandidates() {
        
        /* Todo */
        
        return null;
    }
    
    /* 
    sortByName 
    tra ve danh sach cac thi sinh duoc sap xep theo ho va ten (name)
    */
    public ArrayList<Candidate> sortByName() {
        
        /* Todo */
        
        return null;
    }
    
    /* 
    getSecondYoungestCandidates 
    tráº£ vá»� danh sÃ¡ch cÃ¡c thÃ­ sinh cÃ³ tuá»•i tráº» thá»© 2 trong danh sÃ¡ch 
    (vÃ­ dá»¥: cÃ¡c khÃ¡ch hÃ ng cÃ³ cÃ¡c nÄƒm sinh 1990 1991 1992 1993, 
    tráº£ vá»� danh sÃ¡ch cÃ¡c khÃ¡ch hÃ ng sinh nÄƒm 1992)
    */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        
        /* Todo */
        
        return null;
    }
    
    /*
    printCandidatesFromArray 
    in danh sach cac thi sinh tu mot List da cho
    */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }
        
        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }
    
    /*
    printCandidates 
    in danh cach cac thi sinh duoc luu trong bien thanh vien candidates
    */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }
    
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("candidates.txt")) {
            return;
        }
            
        //ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        //candidateManager.printCandidatesFromArray(selectionCandidates);
        //System.out.println();
        
        //ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        //candidateManager.printCandidatesFromArray(priorityCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        //candidateManager.printCandidatesFromArray(sortedNameCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        //candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}