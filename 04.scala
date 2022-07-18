object Q4{
def shpcost(n:Int):Double = 
    {
        if(0<n && n<=50)
        {
            return n*3;
        }
        else if(n>50)
        {
            return (n*3) + ((n-50)*0.75);
        }
        else{
            return 0;
        }
    }
def bkcost(n:Int):Double = n*24.95;
def discount(bkcst:Double, percntg:Double):Double = bkcst*percntg/100;
def ttl_cost(n:Int):Double = bkcost(n) - discount(bkcost(n),40) + shpcost(n);

def main(args:Array[String]):Int =
    {
        println(ttl_cost(60));
        return 0;
    } 
}