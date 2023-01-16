def sortArrayAscending(nums: Array[Int]):Array[Int]=
  for(i<-0 until nums.length)
    for (j<-0 until nums.length-i-1)
      if nums(j+1)<nums(j)
      then
        var buf = nums(j)
        nums(j)=nums(j+1)
        nums(j+1)=buf

  nums

def sortArrayDescending(nums: Array[Int]): Array[Int] =
  for (i <- 0 until nums.length)
    for (j <- 0 until nums.length - i - 1)
      if nums(j + 1) > nums(j)
      then
        var buf = nums(j)
        nums(j) = nums(j + 1)
        nums(j + 1) = buf

  nums

def deleteOddNum(nums:List[Int]):List[Int] =
  var del = nums.filter(_%2==0)
  del


@main def main1() : Unit =
  var current = Array(2, -1, 0, 3, -9)
  var current1 = Array(2, -1, 0, 3, -9)
  var list = List(1,2,3,4,5,6,7,9,56,7)

  println(sortArrayAscending(current).mkString("(", ", ", ")"))
  println(sortArrayDescending(current1).mkString("(", ", ", ")"))
  println(deleteOddNum(list).mkString("(", ", ", ")"))