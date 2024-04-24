public class calcule {  
    public static int findMin(int arr[]){  
        int min = arr[0]; // تعيين الحد الأدنى إلى القيمة الأولى في المصفوفة
        for(int i = 1; i < arr.length; i++){  
            if(arr[i] < min) // إذا كان العنصر الحالي أصغر من الحد الأدنى
                min = arr[i]; // تحديث الحد الأدنى إلى القيمة الأصغر
        }  
        return min; // إرجاع القيمة الصغرى
    }  
}
