package it.unical.repo_emanuele;

import java.util.List;


public class App 
{
    public List<Integer> sort(List<Integer> list,int order){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-i-1;j++){
                if (((order==0) && (list.get(j)>list.get(j+1))) || ((order==1) && (list.get(j)<list.get(j+1)))){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        return list;
    }
}
