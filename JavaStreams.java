import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreams{
    public static void main (String args[]){
        int[] myNumbers = {2, 1, 2, 1, 3, 6, 1, 4, 5};
        List<Employee> empList = List.of(new Employee(159885,"Abhishek", 20, "IT", 50000),
                new Employee(11101,"Ankit", 20, "IT", 70000),
                new Employee(103,"Rahul", 21, "HR", 40000),
                new Employee(10342,"Tina",  24,"HR", 45000),
                new Employee(106,"Esha",  24,"Finance", 60000),
                new Employee(12304, "Naman", 21,"Finance", 55000),
                new Employee(109,"Sachit", 22, "IT", 80000),
                new Employee(10347,"Pushp",  23,"Marketing", 50000),
                new Employee(145608,"Sumit",  25,"Marketing", 52000));

        List<Transaction> transList = List.of(new Transaction("Food", 100),
                new Transaction("Food", 200),
                new Transaction("Food", 150),
                new Transaction("Shopping", 300),
                new Transaction("Shopping", 250),
                new Transaction("Shopping", 100),
                new Transaction("Utilities", 400),
                new Transaction("Utilities", 300),
                new Transaction("Entertainment", 500),
                new Transaction("Entertainment", 200),
                new Transaction("Travel", 700),
                new Transaction("Travel", 300)
        );

        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 88),
                new Student("Dave", 78),
                new Student("Eve", 91)
        );
        //HashMap
        HashMap<Integer, Employee> employees = (HashMap<Integer,Employee>)empList.stream().collect(Collectors.toMap(Employee::getId,emp -> emp));


        // findSecondHighestNumber();
        // seperateEvenAndOdd();
        // seperateEvenAndOddByPartitioning();
        // findLongestStringInList();
        // findLongestStringInListWithMaxComparing();
        // firstEmployeeWithSalary(50000,empList);
        // findTopHighestPaidEmployeesWithSkip(2,empList);
        // findTopHighestPaidEmployeesWithLimit(2,empList);
        // sortBySalaryThenName(empList);
        // countOfDuplicates();
        // countEmployeesInEachDepartment(empList);
        // findTotalperCatagory(transList);
        // findAverageSalaryForEachDepartment(empList);
        // findHighestPaidEmpInEachDepartment(empList);
        // convertNamesToACommaSeperatedString(empList);
        // commonElementsBetweenTwoLists();
        // listOfListsWithUniqueElements();
        // printAllEmployeeNames(empList);
        // totalCombinedSalryOfAllEmployees(empList);
        // totalCombinedSalryOfAllEmployeesUsingReduce(empList);
        // sortEmployeesBySalaryThenName(empList);
        // calculateTotalbyCatagory(transList);

        // int length = retrunSecondHighestLengthFromString("I am motivated to work with my Organization");
        //int length2 = retrunSecondHighestLengthFromStringUsingGroupingBy("I am motivated to work with my Organization");
        //System.out.println("Second highest length using groupingBy : "+length2);
        // System.out.println("Second highest length : "+length);
        //retrunHighestLengthFromStringUsingReduce("I am motivated to work with my Organization");

        // findEvenNumbersFromList(List.of(1,2,3,4,5,6,7,8));
        // findMaximumNumberFromList(List.of(1,2,3,4,5,6,7,8));

        // countStringsStartingWithAPrefix(List.of("Alice", "Robert", "Bose", "Aazad", "Kalam", "Karthik"),"A");
        // //long startTime = System.currentTimeMillis();
        //findFirstnonRepeatedCharInString("amdocspuneindia");
        //System.out.println(System.currentTimeMillis() - startTime);
        //findFirstnonRepeatedCharInStringUsingMapToObj("amdocspuneindia");
        //findFirstNonRepeatingNumberInList(List.of(3,2,5,6,2,4,7,3));
        //findFirstNonRepeatingNumberInListUsingGroupingBy(List.of(3,2,5,6,2,4,7,3));
        //convertListOfStringsToUpperCase(List.of("Hello","Bye", "Hi", "Good Morning"));
        //calculateTheSumOfNumbersInListUsingReduce(List.of(3,6,9,4,7,8));
        //calculateTheSumOfNumbersInListUsingMapToInt(List.of(3,6,9,4,7,8));
        //anyMatchWithInStringList(List.of("Java", "Stream API", "Lambda"));
        //findDuplicateElementsInList(List.of(1, 2, 3, 4, 2, 5, 1, 2,5));
        //findDuplicateElementsInListUsingSet(List.of(1, 2, 3, 4, 2, 5, 1, 2,5));
        //concateListOfStringUsingReduce(List.of("Hi", "Hello", "Good Morning", "Bye"));
        //findLongestStringInTheList(List.of("Hi", "Hello", "abcdefghijklmnopqrstuvwxyz","Good Morning", "Bye", "Maharashtrian"));
        //findLongestStringInTheListUsingReduce(List.of("Hi", "Hello", "abcdefghijklmnopqrstuvwxyz","Good Morning", "Bye", "Maharashtrian"));
        //removeNullFromList(Arrays.asList("Java", null, "Stream", null, "API"));
        //findAllPalindromicStringsInList(Arrays.asList("radar", "level", "world", "java"));
        //filterAndConvertMapToList(Map.of("A", 5, "B", 15, "C", 10, "D", 20));
        //mostFrequentCharactorInString("success");
        //sumofSquaresOfEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6));
        //partitionStringsByPalindromeAndNonPalindrome(Arrays.asList("radar", "level", "java", "stream"));
        //longestWordFromStringUsingMax("Java Stream API is very powerful");
        //cartesianProductOfTwoLists();
        //findTopScoringStudents(students,3);
        //groupByFirstCharacter(Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry"));
        //concateNateStringInReverseOrderUsingReduce(Arrays.asList("Stream", "API", "is", "awesome"));
        //medianOfElementsInList(Arrays.asList(3, 1, 4, 2, 5, 6));
        //groupEmployeesByDepartmentAndThenAge(empList);
//        findCycleWithinNodes(Arrays.asList(
//                new Node(1, 2), new Node(2, 1), new Node(3, 2), new Node(4, 3), new Node(5, 4), new Node(2, 5)
//        ));
        //findWordWithMaximumVowels(Arrays.asList("stream", "java", "programming", "awesome"));
        //computeRunningSumOfIntegers(Arrays.asList(1, 2, 3, 4, 5));
        //generateFibonacciSeries(10);
        //slidingWindowSum();
        //slidingWindowOfN(Arrays.asList(1, 2, 3, 4, 5, 6) ,3);
        //detectAnagramsInList(Arrays.asList("listen", "silent", "enlist", "google", "elbow", "below", "see","ese"));
        //generatePyramidPatternsByLevel(5);
//        findMaximumPathSumInTriangle(Arrays.asList(
//                Arrays.asList(3),
//                Arrays.asList(7, 4),
//                Arrays.asList(2, 4, 6),
//                Arrays.asList(8, 5, 9, 3)
//        ));
        findNonRepeatingCharactersInString("swiss");
        //findAllSubSequencesOfString("abc");
        //countTopTwoCharactersByFrequencyInString("success");
        //findDuplicateElementsInListUsingFrequency(Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6));
        //checkIfListIsSorted(Arrays.asList(1, 2, 3, 4, 5, 7));
       // findAllSubArraysOfList(Arrays.asList(1, 2, 3));
        //combineTwoListsIntoMap(Arrays.asList("A", "B", "C"),Arrays.asList(1, 2, 3));
        //findPairOfNumbersWithGivenSum(Arrays.asList(6, 1, 2, 3, 4, 5),8);
        //sortNumbersBasedOnFrequencyInDescendingOrder(Arrays.asList(4, 5, 6, 5, 4, 3));
        //findLongestIncreasingSubSequenceInList(Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18));
        //findLongestIncreasingSubSequenceInList(Arrays.asList(1, 9, 11, 10, 2, 10));
        //findLongestIncreasingSubSequenceInListUsingStream(Arrays.asList(1, 9, 11, 10, 2, 10));
        //sortHashMapByKeyUsingTreeMap(employees);
        //sortHAshMApByKeyUsingStream(employees);
        //shiftAllNumberOccurancesToEnd(myNumbers,1);  //{2, 1, 2, 1, 3, 6, 1, 4, 5};
        //shiftAllNumberOccurancesToEndUsingStream(myNumbers,1);   //{2, 1, 2, 1, 3, 6, 1, 4, 5};
    }

    private static void shiftAllNumberOccurancesToEndUsingStream(int[] myNumbers, int number) {
        //Map<Boolean,List<Integer>> numMap
        List<Integer> numList = Arrays.stream(myNumbers).mapToObj(i -> (Integer) i)
                .collect(Collectors.partitioningBy(i -> i == number))
                .values()
                .stream()
                .flatMap(List::stream).toList();
        System.out.print(numList);
    }
    private static void shiftAllNumberOccurancesToEnd(int[] myNumbers, int n) {
        int[] output = new int[myNumbers.length];
        int j=0;
        System.out.println("original array : "+Arrays.asList( myNumbers));
        for(int i=0;i<myNumbers.length;i++){
            if(myNumbers[i]!=n){
                output[j]=myNumbers[i];
                j++;
            }
            System.out.print(myNumbers[i]+" ");
        }
        System.out.println("\nAfter Shifting :");
        for(int i=0;i<myNumbers.length;i++){
            if(myNumbers[i]==n){
                output[j]=myNumbers[i];
                j++;
            }
        }
        for(int num :output){
            System.out.print(num+" ");
        }

    }

    private static void sortHAshMApByKeyUsingStream(HashMap<Integer,Employee> employees) {
        System.out.println("before sorting Employee map : "+ employees);
        Map<Integer,Employee> sortedMap = employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        System.out.println("after sorting Employee map : "+ sortedMap);
    }

    private static void sortHashMapByKeyUsingTreeMap(Map<Integer,Employee> employees) {
        System.out.println("before sorting Employee map : "+ employees);
        Map<Integer, Employee> treemap = new TreeMap<>(employees);
        System.out.println("after sorting Employee map : "+ treemap);

    }

    public static void findLongestIncreasingSubSequenceInListUsingStream(List<Integer> numbers){
        List<Integer> lis = new ArrayList<>();
        numbers.forEach(num -> {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) pos = -(pos + 1);
            if (pos < lis.size()) lis.set(pos, num);
            else lis.add(num);
        });
        System.out.println(lis);
    }
    public static void findLongestIncreasingSubSequenceInList(List<Integer> numbers){
        if (numbers == null || numbers.isEmpty()) {
            System.out.println(new ArrayList<>());
            return;
        }
        int n = numbers.size();
        int[] dp = new int[n];       // Stores LIS length ending at index i
        int[] parent = new int[n];   // To reconstruct the subsequence
        Arrays.fill(dp, 1);      // Initialize array with value 1
        Arrays.fill(parent, -1); // Initialize array with value -1
        int maxLength = 1;
        int maxIndex = 0;
        // 1. Dynamic Programming to find LIS lengths
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(i) > numbers.get(j) && dp[j] + 1 > dp[i]) { //9 > 1 && 1+1 >
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }
        // 2. Reconstruct the actual subsequence list
        List<Integer> longestSubSeq = new ArrayList<>();
        int curr = maxIndex;
        while (curr != -1) {
            longestSubSeq.add(numbers.get(curr));
            curr = parent[curr];
        }
        Collections.reverse(longestSubSeq); // Reverse because we built it backwards
        // Print final result
        System.out.println(longestSubSeq);
    }
    public static void sortNumbersBasedOnFrequencyInDescendingOrder(List<Integer> numbers){
        // -Collections.frequency(numbers,n) to sort in descending order and For ascending order (Collections.frequency(numbers,n))
        System.out.println(numbers.stream().
                sorted(Comparator.comparing( n -> -Collections.frequency(numbers,n)))
                .distinct().toList());
    }
    public static void findPairOfNumbersWithGivenSum(List<Integer> list, int sum){
        System.out.println(list.stream().flatMap(a -> list.stream()
                .filter(b -> a+b == sum && a<b)
                        .map(b -> Arrays.asList(a,b)))
                .toList());
    }
    public static void combineTwoListsIntoMap(List<String> key, List<Integer> value){
        System.out.println(IntStream.range(0, key.size()).boxed().collect(Collectors.toMap(key::get, value::get)));
    }
    public static void findAllSubArraysOfList(List<Integer> list){
        System.out.println(IntStream.range(0, list.size())
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i+1, list.size())
                        .mapToObj(j -> list.subList(i,j)))
                .toList());

    }
    public static void checkIfListIsSorted(List<Integer> list){
        System.out.println(IntStream.range(0,list.size()-1).allMatch( i -> list.get(i).compareTo(list.get(i+1)) <=0));

    }
    public static void findDuplicateElementsInListUsingFrequency(List<Integer> list){
        System.out.println(list.stream().filter(n -> Collections.frequency(list,n) > 1)
                .collect(Collectors.toSet()));
    }

    public static void countTopTwoCharactersByFrequencyInString(String string){
        System.out.println(string.chars().mapToObj(ch -> (char) ch).
                collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().
                sorted(Comparator.comparing(Map.Entry::getValue)).skip(2).toList());
    }
    public static void findAllSubSequencesOfString(String str){
        System.out.println(IntStream.range(0, 1 << str.length())
                .mapToObj(i -> IntStream.range(0, str.length()).filter(j -> (i & (1 << j)) != 0)
                .mapToObj(j -> String.valueOf(str.charAt(j)))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList()));
        //System.out.println(str.chars().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining(",")));
    }
    public static void findNonRepeatingCharactersInString(String str){
        System.out.println( str.chars().mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null));
        //Map<Character,Long> map =str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        //System.out.println(str.chars().mapToObj(ch -> (char) ch).filter(ch -> map.get(ch) == 1).toList());
    }
    public static void findMaximumPathSumInTriangle(List<List<Integer>> triangle){
        System.out.println(IntStream.range(0,triangle.size()).mapToObj(i -> triangle.get(triangle.size()-1-i))
                .reduce((rowBelow, currentRow) -> IntStream.range(0,currentRow.size())
                        .mapToObj(j -> currentRow.get(j)+(Math.max(rowBelow.get(j), rowBelow.get(j+1)))).toList()).orElseThrow().get(0));
    }
    public static void generatePyramidPatternsByLevel(int level){
        IntStream.rangeClosed(1,level)
                .mapToObj(i -> " "
                        .repeat(level-i)+IntStream
                        .rangeClosed(1,i)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .toList()
                .forEach(System.out::println);
    }
    public static void detectAnagramsInList(List<String> list){
        System.out.println(list.stream().collect(Collectors.groupingBy(str -> str.chars().sorted().mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining()))));
    }
    public static void slidingWindowOfN(List<Integer> list, int n){
        System.out.println(IntStream.range(0,n+1).mapToObj(i -> list.subList(i,i+n)).collect(Collectors.toList()));
    }
    public static void slidingWindowSum(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> slidingWindows = IntStream.range(0, numbers.size() - 2)
                .mapToObj(i -> numbers.subList(i, i + 3).stream().mapToInt(Integer::intValue).sum())
                .collect(Collectors.toList());
        System.out.println(slidingWindows);
    }
    public static void generateFibonacciSeries(int n){

    }
    public static void computeRunningSumOfIntegers(List<Integer> numbers){
        List<Integer> runningSum = IntStream.range(0, numbers.size()).mapToObj(i -> numbers.subList(0, i + 1).stream().mapToInt(Integer::intValue).sum() ).collect(Collectors.toList());
        System.out.println(runningSum);
    }
    public static void findWordWithMaximumVowels(List<String> list){
        System.out.println(list.stream().max(Comparator.comparingInt(str -> (int)str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count())).orElse(""));
    }
    public static void findCycleWithinNodes(List<Node> nodes){
        System.out.println(nodes.stream()
                .anyMatch(node -> nodes.stream().filter(n -> n.id == node.parentId)
                        .anyMatch(n -> n.id == node.id)));
//        System.out.println(nodes.stream()
//                .anyMatch(node -> nodes.stream().filter(n -> n.id == node.parentId)
//                        .anyMatch(n -> n.id == node.id)));
    }
    public static void groupEmployeesByDepartmentAndThenAge(List<Employee> employees){
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getAge, Collectors.mapping(Employee::getName,Collectors.toList())))));
    }
    public static void medianOfElementsInList(List<Integer> list){
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList.size()%2!=0 ? sortedList.get(sortedList.size()/2) : (sortedList.get(sortedList.size()/2 -1) + sortedList.get(sortedList.size()/2))/2.0);
    }
    public static void concateNateStringInReverseOrderUsingReduce(List<String> strings){
        System.out.println(strings.stream().reduce((string1, string2) -> string2 +" "+ string1).orElse(""));
    }
    public static void groupByFirstCharacter(List<String> fruits){
        System.out.println(fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0))));
    }
    public static void findTopScoringStudents(List<Student> students, int top){
       System.out.println(students.stream()
               .sorted(Comparator.comparing(student -> -1* student.getScore())).map(Student::getName).limit(top).toList());
    }
    public static void cartesianProductOfTwoLists(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

       System.out.println(list1.stream().flatMap(n -> list2.stream().map(e -> "("+n+", "+e+")")).collect(Collectors.toList()));
    }
    public static void longestWordFromStringUsingMax(String str){
        System.out.println(Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length))
                .orElseThrow());
    }
    public static void partitionStringsByPalindromeAndNonPalindrome(List<String> list){
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(str -> new StringBuilder(str)
                        .reverse().toString().equals(str))));
    }
    public static void sumofSquaresOfEvenNumbers(List<Integer> list){
        System.out.println(list.stream().
                filter(n -> n%2 == 0).
                mapToInt(n -> n*n)
                .sum());
    }
    public static void mostFrequentCharactorInString(String str){
        System.out.println(
                str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow());
    }
    public static void filterAndConvertMapToList(Map<String, Integer> map){
        System.out.println(map.entrySet().stream()
                .filter( entry -> entry.getValue() > 10)
                .map(entryS -> entryS.getKey()).collect(Collectors.toList()));
    }
    public static void findAllPalindromicStringsInList(List<String> list){
        System.out.println(list.stream().filter(str -> new StringBuilder(str).reverse().toString().equals(str)).collect(Collectors.toList()));
    }
    public static void removeNullFromList(List<String> list){
        System.out.println(list.stream().filter(Objects::nonNull).collect(Collectors.toList()));
        //list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
    public static void findLongestStringInTheListUsingReduce(List<String> list){
        System.out.println(list.stream().reduce((str1, str2) -> str1.length()>str2.length() ? str1 : str2 ).orElse(null));
    }
    public static void findLongestStringInTheList(List<String> list){
        int longetsLength = list.stream().map(str -> str.length()).sorted(Comparator.reverseOrder()).findFirst().orElse(0);
        System.out.println(list.stream().filter(str -> str.length() == longetsLength).findFirst().orElse(null));

    }
    public static void concateListOfStringUsingReduce(List<String> list){
        System.out.println(list.stream().reduce("", (s1,s2) -> s1+" "+s2+" ").trim());
    }
    public static void findDuplicateElementsInListUsingSet(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        System.out.println(list.stream().filter(l -> !set.add(l)).distinct().toList());
    }
    public static void findDuplicateElementsInList(List<Integer> list){
        System.out.println(list.stream()
                .filter(n -> list.indexOf(n) != list.lastIndexOf(n))
                .distinct().toList());
    }
    public static void anyMatchWithInStringList(List<String> list){
        System.out.println(list.stream().anyMatch(str -> str.contains("API")));
    }
    public static void calculateTheSumOfNumbersInListUsingMapToInt(List<Integer> list){
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
    public static void calculateTheSumOfNumbersInListUsingReduce(List<Integer> list){
        System.out.println(list.stream().reduce(0, (a,b) -> a+b));
    }
    public static void convertListOfStringsToUpperCase(List<String> list){
        System.out.println(list.stream().map(str -> str.toUpperCase()).toList());
    }
    public static void findFirstNonRepeatingNumberInListUsingGroupingBy(List<Integer> list){
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).findFirst().orElse(null));
    }
    public static void findFirstNonRepeatingNumberInList(List<Integer> list){
        System.out.println(list.stream()
                .filter(n -> list.indexOf(n) == list.lastIndexOf(n))
                .findFirst().orElse(null));
    }
    public static void findFirstnonRepeatedCharInStringUsingMapToObj(String str){
        System.out.println(str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst().orElse(null));
    }
    public static void findFirstnonRepeatedCharInString(String str){
        Set<String> set= new HashSet<>();
        System.out.println(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1).map(entry -> entry.getKey())
                .findFirst().orElse(null));
        //[y, i, c, w]
    }
    public static void countStringsStartingWithAPrefix(List<String> list, String prefix){
        System.out.println(list.stream().filter(str -> str.startsWith(prefix)).collect(Collectors.toList()));
    }
    public static void findMaximumNumberFromList(List<Integer> list){
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).findFirst().get());
    }
    public static void findEvenNumbersFromList(List<Integer> list){
        System.out.println(list.stream().filter(n -> n%2==0).collect(Collectors.toList()));
    }
    public static void retrunHighestLengthFromStringUsingReduce(String str){
        System.out.println(Arrays.stream(str.split(" ")).map(string -> string.length())
                .reduce((str1, str2) -> str1 > str2 ? str1 : str2).orElse(0));
    }
    public static int retrunSecondHighestLengthFromStringUsingGroupingBy(String str){
        System.out.println(Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(ch -> ch.length(), Collectors.counting())));
        int n = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(ch -> ch.length()))
                .entrySet().stream().map(ch -> ch.getKey())
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse(null);
        return n;
    }
    public static int retrunSecondHighestLengthFromString(String str){

        return Arrays.stream(str.split(" "))
                .map(s -> s.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
    public static void calculateTotalbyCatagory(List<Transaction> transactions){
        Map<String, Integer> map =  transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.getCatagory(), Collectors.summingInt(transaction -> transaction.getAmount())));
        System.out.println(map);
    }
    public static void sortEmployeesBySalaryThenName(List<Employee> employees){
        List<Employee> emplSorted = employees.stream().sorted( (emp1,emp2) -> {
            if(emp1.getSalary() > emp2.getSalary())
                return 1;
            else if(emp1.getSalary() < emp2.getSalary() )
                return -1;
            else
                return emp1.getName().compareTo(emp2.getName());
        }).collect(Collectors.toList());

        System.out.println(emplSorted);

    }
    public static void totalCombinedSalryOfAllEmployeesUsingReduce(List<Employee> employees){
        System.out.print(employees.parallelStream().map(emp -> emp.getSalary()).reduce(0,(a,b) -> a+b));
    }
    public static void totalCombinedSalryOfAllEmployees(List<Employee> employees){
        System.out.print(employees.parallelStream().collect(Collectors.summingInt(employee -> employee.getSalary())));
    }
    public static void printAllEmployeeNames(List<Employee> employees){
        System.out.print(employees.parallelStream().map(emp -> emp.getName()).toList());

    }
    public static void listOfListsWithUniqueElements(){
        List<List<Integer>> lol = List.of(List.of(1, 2, 3, 4),
                List.of(3, 4, 5, 6),
                List.of(7, 8, 1, 2),
                List.of(9, 10, 5, 6),
                List.of(11, 12, 7, 8));

        System.out.println(lol.stream().flatMap(innerList -> innerList.stream()).distinct().collect(Collectors.toList()));
    }
    public static void commonElementsBetweenTwoLists(){
        List<Integer> l1 = List.of(1, 2, 3, 4, 8, 9, 10);
        List<Integer> l2 = List.of(3, 4, 5, 6, 2, 7 ,9);

        //Set<Integer> set = new HashSet<Integer>(l2);

        System.out.println(l1.stream().filter(n -> l2.contains(n)).collect(Collectors.toList()));

    }
    public static void convertNamesToACommaSeperatedString(List<Employee> employees){

        System.out.println(employees.stream().map(employee -> employee.getName()).collect(Collectors.joining(",")));
    }
    public static void findHighestPaidEmpInEachDepartment(List<Employee> employees){
        System.out.println(employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.maxBy(Comparator.comparingInt(employee -> employee.getSalary())))));

    }
    public static void findAverageSalaryForEachDepartment(List<Employee> employees){
        System.out.println(employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.averagingInt(employee -> employee.getSalary()))));
    }
    public static void findTotalperCatagory(List<Transaction> transactions){
        System.out.println(transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.getCatagory(), Collectors.summingInt(transaction -> transaction.getAmount()))));

    }
    public static void countEmployeesInEachDepartment(List<Employee> employees){
        System.out.println( employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting())));
    }
    public static void countOfDuplicates(){
        List<Integer> list = List.of(3, 2, 3, 4, 4, 1, 2, 1, 1, 1, 5, 6, 5);

        System.out.println(list.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting())));
    }
    public static void sortBySalaryThenName(List<Employee> employees){
        List<Employee> snSorted = employees.stream().sorted( (emp1, emp2) -> {
                    if(emp1.getSalary()>emp2.getSalary())
                        return 1;
                    else if(emp1.getSalary()<emp2.getSalary())
                        return -1;
                    else
                        return emp1.getName().compareTo(emp2.getName());
                }
        ).collect(Collectors.toList());

        System.out.println("Sorted by Salary and Name : "+snSorted);
    }
    public static void findTopHighestPaidEmployeesWithLimit(int top, List<Employee> employees){

        List<Employee> empl = employees.stream().sorted(Comparator.comparing(emp -> -1 * emp.getSalary())).limit(top)
                .collect(Collectors.toList());
        System.out.println("Using Limit : "+empl);
    }
    public static void findTopHighestPaidEmployeesWithSkip(int top, List<Employee> employees){

        List<Employee> empl = employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).skip(employees.size()-top)
                .collect(Collectors.toList());
        System.out.println("Using Skip : " +empl);
    }
    public static void firstEmployeeWithSalary(int salary, List<Employee> employees){

        Optional<Employee> oEmp = employees.stream().filter(emp -> emp.getSalary()>50000).findFirst();

        System.out.println(oEmp.isPresent() ? oEmp.get().toString() : "");
    }
    public static void findLongestStringInListWithMaxComparing(){
        List<String> strList = List.of("Java", "SpringBoot", "API");
        System.out.println(strList.stream().max(Comparator.comparing(str -> str.length())).get());
    }
    public static void findLongestStringInList(){
        List<String> strList = List.of("Java", "SpringBoot", "API");
        Optional<Map.Entry<Integer,String>> found = strList.stream()
                .collect(Collectors.toMap(str -> str.length(), str -> str))
                .entrySet().stream()
                .skip(strList.size()-1)
                .findFirst();

        System.out.println(found.get().getValue());
    }
    public static void seperateEvenAndOddByPartitioning(){
        List<Integer> intList = List.of(1,2,3,4,5);

        Map<Boolean,List<Integer>> lMap = intList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(lMap);

    }
    public static void seperateEvenAndOdd(){
        List<Integer> intList = List.of(1,2,3,4,5);
        List<Integer> evenL = intList.stream().filter(n -> n%2==0).collect(Collectors.toList());
        List<Integer> oddL = intList.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        System.out.print("Even Numbers : "+evenL);
        System.out.println("Odd Numbers : "+oddL);

    }
    public static void findSecondHighestNumber(){
        List<Integer> intList = List.of(20,10,10,45,30,45,5,20);

        Optional<Integer> result = intList.stream()
                .distinct()
                .sorted()
                .skip(3)
                .findFirst();

        System.out.println(result.isPresent() ? result.get() : 0);
    }
}

class Employee{
    private int id;
    private String name;
    private String department;
    private int salary;
    private int age;

    public Employee(int id, String name, int age, String department, int salary){
        this.id=id;
        this.name=name;
        this.age = age;
        this.department=department;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", department=").append(department);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }



}

class Transaction{
    String catagory;
    int amount;

    public Transaction(String catagory, int amount){
        this.catagory = catagory;
        this.amount = amount;
    }

    public String getCatagory() {
        return catagory;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transaction{");
        sb.append("catagory=").append(catagory);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}

class Student {
    String name;
    int score;
    Student(String name, int score) { this.name = name; this.score = score; }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class Node{
    int id;
    int parentId;
    Node(int id, int parentId){
        this.id = id;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", parentId=" + parentId +
                '}';
    }
}
