/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */

public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
    并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    */
    
    /*
    解决思路：
    刚开始想到快排，因为效率比较高，但快排不稳定，
    题中要求调整后奇数与奇数、偶数与偶数之间相对位置不能发生改变，
    所以只能选择稳定的排序算法，于是就选择了直接插入排序，时间复杂度是n平方。
    */
    public void reOrderArray(int [] array) {
        int len = array.length;
        int temp = 0,j=0;
        for(int  i=1;i<len;++i){
            temp = array[i];
            for(j=i-1;j>=0;j--){
                if(!isEvenNumber(temp)&&isEvenNumber(array[j]))
                    array[j+1] = array[j];
                else
                    break;
            }
            array[j+1] = temp;
        }
    }
    //判断一个数是否为偶数
    private boolean isEvenNumber(int number){
        if(number%2==0)
            return true;
        return false;
    }
}
