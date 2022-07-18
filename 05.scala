object Q5{

  def easy_pace(dis:Double):Double =dis*8;
  def tempo(dis:Double):Double =dis*7;
  def ttl_run_time(dis1:Double , dis2:Double, dis3:Double):Double =easy_pace(dis1) + tempo(dis2) +easy_pace(dis3);

  def main(args:Array[String]):Int =
    { 
        println(ttl_run_time(2,3,2));
        return 0;
    }
}