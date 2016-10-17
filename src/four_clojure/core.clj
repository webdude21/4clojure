;; http://www.4clojure.com/problem/1
;; Nothing but the Truth
;; Difficulty: Elementary Topics:
;; Description: This is a clojure form. Enter a value which will make the form evaluate to true. Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true. 
;; TestCases: 
;; (= __ true)
true

;; http://www.4clojure.com/problem/2
;; Simple Math
;; Difficulty: Elementary Topics:
;; Description: If you are not familiar with polish notation, simple arithmetic might seem confusing. Note: Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem. 
;; TestCases: 
;; (= (- 10 (* 2 3)) __)
4

;; http://www.4clojure.com/problem/3
;; Intro to Strings
;; Difficulty: Elementary Topics:
;; Description: Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings. 
;; TestCases: 
;; (= __ (.toUpperCase "hello world"))
"HELLO WORLD"

;; http://www.4clojure.com/problem/4
;; Intro to Lists
;; Difficulty: Elementary Topics:
;; Description: Lists can be constructed with either a function or a quoted form. 
;; TestCases: 
;; (= (list __) '(:a :b :c))
:a :b :c

;; http://www.4clojure.com/problem/5
;; Lists: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a list, the conj function will return a new list with one or more items "added" to the front. 
;; TestCases: 
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
'(1 2 3 4)

;; http://www.4clojure.com/problem/6
;; Intro to Vectors
;; Difficulty: Elementary Topics:
;; Description: Vectors can be constructed several ways. You can compare them with lists. 
;; TestCases: 
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
:a :b :c

;; http://www.4clojure.com/problem/7
;; Vectors: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end. 
;; TestCases: 
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))
[1 2 3 4]

;; http://www.4clojure.com/problem/8
;; Intro to Sets
;; Difficulty: Elementary Topics:
;; Description: Sets are collections of unique values. 
;; TestCases: 
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
#{:a :b :c :d}

;; http://www.4clojure.com/problem/9
;; Sets: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a set, the conj function returns a new set with one or more keys "added". 
;; TestCases: 
;; (= #{1 2 3 4} (conj #{1 4 3} __))
2

;; http://www.4clojure.com/problem/10
;; Intro to Maps
;; Difficulty: Elementary Topics:
;; Description: Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required. 
;; TestCases: 
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))
20

;; http://www.4clojure.com/problem/11
;; Maps: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a map, the conj function returns a new map with one or more key-value pairs "added". 
;; TestCases: 
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
{:b 2}

;; http://www.4clojure.com/problem/12
;; Intro to Sequences
;; Difficulty: Elementary Topics:
;; Description: All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last. 
;; TestCases: 
;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))
3

;; http://www.4clojure.com/problem/13
;; Sequences: rest
;; Difficulty: Elementary Topics:
;; Description: The rest function will return all the items of a sequence except the first. 
;; TestCases: 
;; (= __ (rest [10 20 30 40]))
[20 30 40]

;; http://www.4clojure.com/problem/14
;; Intro to Functions
;; Difficulty: Elementary Topics:
;; Description: Clojure has many different ways to create functions. 
;; TestCases: 
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))
8

;; http://www.4clojure.com/problem/15
;; Double Down
;; Difficulty: Elementary Topics:
;; Description: Write a function which doubles a number. 
;; TestCases: 
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)
* 2

;; http://www.4clojure.com/problem/16
;; Hello World
;; Difficulty: Elementary Topics:
;; Description: Write a function which returns a personalized greeting. 
;; TestCases: 
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")
format "Hello, %s!"

;; http://www.4clojure.com/problem/17
;; Sequences: map
;; Difficulty: Elementary Topics:
;; Description: The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure. 
;; TestCases: 
;; (= __ (map #(+ % 5) '(1 2 3)))
'(6 7 8)

;; http://www.4clojure.com/problem/18
;; Sequences: filter
;; Difficulty: Elementary Topics:
;; Description: The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true. 
;; TestCases: 
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))
'(6 7)

;; http://www.4clojure.com/problem/19
;; Last Element
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the last element in a sequence.  Special Restrictions last
;; TestCases: 
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")
(fn [s]
  (if (next s)
    (recur (next s))
    (first s)))

;; http://www.4clojure.com/problem/20
;; Penultimate Element
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which returns the second to last element from a sequence. 
;; TestCases: 
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])
(fn [x] (nth x (- (count x) 2)))

;; http://www.4clojure.com/problem/21
;; Nth Element
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the Nth element from a sequence.  Special Restrictions nth
;; TestCases: 
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c] 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
(fn [coll ind] (last (take (inc ind) coll)))

;; http://www.4clojure.com/problem/22
;; Count a Sequence
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the total number of elements in a sequence.  Special Restrictions count
;; TestCases: 
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)
(fn [lst]
  (loop [i lst cnt 0]
    (if (empty? i)
      cnt
      (recur (rest i) (inc cnt)))))


;; http://www.4clojure.com/problem/23
;; Reverse a Sequence
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which reverses a sequence.  Special Restrictions reverse rseq
;; TestCases: 
;; (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
(fn my-reverse
  [coll]
  (if (empty? coll)
    []
    (conj (my-reverse (rest coll)) (first coll))))

;; http://www.4clojure.com/problem/24
;; Sum It All Up
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which returns the sum of a sequence of numbers. 
;; TestCases: 
;; (= (__ [1 2 3]) 6)
;; (= (__ (list 0 -2 5 5)) 8)
;; (= (__ #{4 2 1}) 7)
;; (= (__ '(0 0 -1)) -1)
;; (= (__ '(1 10 3)) 14)
reduce +

;; http://www.4clojure.com/problem/25
;; Find the odd numbers
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which returns only the odd numbers from a sequence. 
;; TestCases: 
;; (= (__ #{1 2 3 4 5}) '(1 3 5))
;; (= (__ [4 2 1 6]) '(1))
;; (= (__ [2 2 4 6]) '())
;; (= (__ [1 1 1 3]) '(1 1 1 3))
filter odd?

;; http://www.4clojure.com/problem/26
;; Fibonacci Sequence
;; Difficulty: Easy Topics: Fibonacci seqs
;; Description: Write a function which returns the first X fibonacci numbers. 
;; TestCases: 
;; (= (__ 3) '(1 1 2))
;; (= (__ 6) '(1 1 2 3 5 8))
;; (= (__ 8) '(1 1 2 3 5 8 13 21))
(fn [n]
  (take n
        (map first
             (iterate
               (fn [[a b]] [b (+' a b)]) [1 1]))))

;; http://www.4clojure.com/problem/27
;; Palindrome Detector
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which returns true if the given sequence is a palindrome. Hint: "racecar" does not equal '(\r \a \c \e \c \a \r) 
;; TestCases: 
;; (false? (__ '(1 2 3 4 5)))
;; (true? (__ "racecar"))
;; (true? (__ [:foo :bar :foo]))
;; (true? (__ '(1 1 3 3 1 1)))
;; (false? (__ '(:a :b :c)))
(fn [x]
  (let [res (reverse x)]
    (= x (if (string? x)
           (apply str res)
           res))))

;; http://www.4clojure.com/problem/28
;; Flatten a Sequence
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which flattens a sequence.  Special Restrictions flatten
;; TestCases: 
;; (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;; (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;; (= (__ '((((:a))))) '(:a))
(fn [coll]
  (filter (complement sequential?)
          (rest (tree-seq sequential? seq coll))))

;; http://www.4clojure.com/problem/29
;; Get the Caps
;; Difficulty: Easy Topics: strings
;; Description: Write a function which takes a string and returns a new string containing only the capital letters. 
;; TestCases: 
;; (= (__ "HeLlO, WoRlD!") "HLOWRD")
;; (empty? (__ "nothing"))
;; (= (__ "$#A(*&987Zf") "AZ")
(fn [chrs]
  (apply str (filter (fn [x] (Character/isUpperCase x)) chrs)))

;; http://www.4clojure.com/problem/30
;; Compress a Sequence
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which removes consecutive duplicates from a sequence. 
;; TestCases: 
;; (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;; (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;; (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
dedupe

;; http://www.4clojure.com/problem/31
;; Pack a Sequence
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which packs consecutive duplicates into sub-lists. 
;; TestCases: 
;; (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;; (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;; (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
#(partition-by identity %)

;; http://www.4clojure.com/problem/32
;; Duplicate a Sequence
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which duplicates each element of a sequence. 
;; TestCases: 
;; (= (__ [1 2 3]) '(1 1 2 2 3 3))
;; (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
(fn [coll]
  (mapcat #(vector % %) coll))

;; http://www.4clojure.com/problem/33
;; Replicate a Sequence
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which replicates each element of a sequence a variable number of times. 
;; TestCases: 
;; (= (__ [1 2 3] 2) '(1 1 2 2 3 3))
;; (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
;; (= (__ [4 5 6] 1) '(4 5 6))
;; (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
;; (= (__ [44 33] 2) [44 44 33 33])
(fn [coll times]
  (mapcat #(apply vector (repeat times %)) coll))


;; http://www.4clojure.com/problem/34
;; Implement range
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which creates a list of all integers in a given range.  Special Restrictions range
;; TestCases: 
;; (= (__ 1 4) '(1 2 3))
;; (= (__ -2 2) '(-2 -1 0 1))
;; (= (__ 5 8) '(5 6 7))
(fn [start end]
  (loop [i start acc []]
    (if (< i end)
      (recur (inc i) (conj acc i)) acc)))

;; http://www.4clojure.com/problem/35
;; Local bindings
;; Difficulty: Elementary Topics: syntax
;; Description: Clojure lets you give local names to values using the special let-form. 
;; TestCases: 
;; (= __ (let [x 5] (+ 2 x)))
;; (= __ (let [x 3, y 10] (- y x)))
;; (= __ (let [x 21] (let [y 3] (/ x y))))
7

;; http://www.4clojure.com/problem/36
;; Let it Be
;; Difficulty: Elementary Topics: math syntax
;; Description: Can you bind x, y, and z so that these are all true? 
;; TestCases: 
;; (= 10 (let __ (+ x y)))
;; (= 4 (let __ (+ y z)))
;; (= 1 (let __ z))
[z 1 y 3 x 7]

;; http://www.4clojure.com/problem/37
;; Regular Expressions
;; Difficulty: Elementary Topics: regex syntax
;; Description: Regex patterns are supported with a special reader macro. 
;; TestCases: 
;; (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
"ABC"

;; http://www.4clojure.com/problem/38
;; Maximum value
;; Difficulty: Easy Topics: core-functions
;; Description: Write a function which takes a variable number of parameters and returns the maximum value.  Special Restrictions max max-key
;; TestCases: 
;; (= (__ 1 8 3 4) 8)
;; (= (__ 30 20) 30)
;; (= (__ 45 67 11) 67)
(fn [& args]
  (last (sort args)))

;; http://www.4clojure.com/problem/39
;; Interleave Two Seqs
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.  Special Restrictions interleave
;; TestCases: 
;; (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;; (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;; (= (__ [1 2 3 4] [5]) [1 5])
;; (= (__ [30 20] [25 15]) [30 25 20 15])
#(mapcat vector %1 %2)

;; http://www.4clojure.com/problem/40
;; Interpose a Seq
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which separates the items of a sequence by an arbitrary value.  Special Restrictions interpose
;; TestCases: 
;; (= (__ 0 [1 2 3]) [1 0 2 0 3])
;; (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;; (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
(fn [_ coll]
  (rest (mapcat #(vector _ %) coll)))

;; http://www.4clojure.com/problem/41
;; Drop Every Nth Item
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which drops every Nth item from a sequence. 
;; TestCases: 
;; (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;; (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;; (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
(defn drop-every-nth-element [coll el]
  (apply concat (partition-all (dec el) el coll)))

;; http://www.4clojure.com/problem/42
;; Factorial Fun
;; Difficulty: Easy Topics: math
;; Description: Write a function which calculates factorials. 
;; TestCases: 
;; (= (__ 1) 1)
;; (= (__ 3) 6)
;; (= (__ 5) 120)
;; (= (__ 8) 40320)
(defn factorial [n]
  (reduce * (range 1 (inc n))))

;; http://www.4clojure.com/problem/43
;; Reverse Interleave
;; Difficulty: Medium Topics: seqs
;; Description: Write a function which reverses the interleave process into x number of subsequences. 
;; TestCases: 
;; (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
;; (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
;; (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))
(defn reverse-interleave [seq el]
  (apply map list (partition el seq)))

;; http://www.4clojure.com/problem/44
;; Rotate Sequence
;; Difficulty: Medium Topics: seqs
;; Description: Write a function which can rotate a sequence in either direction. 
;; TestCases: 
;; (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;; (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;; (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;; (= (__ 1 '(:a :b :c)) '(:b :c :a))
;; (= (__ -4 '(:a :b :c)) '(:c :a :b))
(defn rotate [offset coll]
  (let [coll-size (count coll)]
    (take coll-size (drop (mod offset coll-size) (cycle coll)))))

;; http://www.4clojure.com/problem/45
;; Intro to Iterate
;; Difficulty: Easy Topics: seqs
;; Description: The iterate function can be used to produce an infinite lazy sequence. 
;; TestCases: 
;; (= __ (take 5 (iterate #(+ 3 %) 1)))
'(1 4 7 10 13)

;; http://www.4clojure.com/problem/46
;; Flipping out
;; Difficulty: Medium Topics: higher-order-functions
;; Description: Write a higher-order function which flips the order of the arguments of an input function. 
;; TestCases: 
;; (= 3 ((__ nth) 2 [1 2 3 4 5]))
;; (= true ((__ >) 7 8))
;; (= 4 ((__ quot) 2 8))
;; (= [1 2 3] ((__ take) [1 2 3 4 5] 3))
(fn [in-fn]
  #(in-fn %2 %1))

;; http://www.4clojure.com/problem/47
;; Contain Yourself
;; Difficulty: Easy Topics:
;; Description: The contains? function checks if a KEY is present in a given collection. This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists. 
;; TestCases: 
;; (contains? #{4 5 6} __)
;; (contains? [1 1 1 1 1] __)
;; (contains? {4 :a 2 :b} __)
;; (not (contains? '(1 2 4) __))
4

;; http://www.4clojure.com/problem/48
;; Intro to some
;; Difficulty: Easy Topics:
;; Description: The some function takes a predicate function and a collection. It returns the first logical true value of (predicate x) where x is an item in the collection. 
;; TestCases: 
;; (= __ (some #{2 7 6} [5 6 7 8]))
;; (= __ (some #(when (even? %) %) [5 6 7 8]))
6

;; http://www.4clojure.com/problem/49
;; Split a sequence
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which will split a sequence into two parts.  Special Restrictions split-at
;; TestCases: 
;; (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;; (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;; (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
(fn [split-point seq]
  (let [splited (partition-all split-point seq)]
    (vector (first splited) (apply concat (rest splited)))))

;; http://www.4clojure.com/problem/50
;; Split by Type
;; Difficulty: Medium Topics: seqs
;; Description: Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases). 
;; TestCases: 
;; (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})
;; (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})
;; (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})
#(vals (group-by type %))

;; http://www.4clojure.com/problem/51
;; Advanced Destructuring
;; Difficulty: Easy Topics: destructuring
;; Description: Here is an example of some more sophisticated destructuring. 
;; TestCases: 
;; (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))
[1 2 3 4 5]

;; http://www.4clojure.com/problem/52
;; Intro to Destructuring
;; Difficulty: Easy Topics: destructuring
;; Description: Let bindings and function parameter lists support destructuring. 
;; TestCases: 
;; (= [2 4] (let [[a b c d e f g] (range)] __))
[c e]

;; http://www.4clojure.com/problem/53
;; Longest Increasing Sub-Seq
;; Difficulty: Hard Topics: seqs
;; Description: Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify. 
;; TestCases: 
;; (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
;; (= (__ [5 6 1 3 2 7]) [5 6])
;; (= (__ [2 3 3 4 5]) [3 4 5])
;; (= (__ [7 6 5 4]) [])






;; http://www.4clojure.com/problem/54
;; Partition a Sequence
;; Difficulty: Medium Topics: seqs core-functions
;; Description: Write a function which returns a sequence of lists of x items each. Lists of less than x items should not be returned.  Special Restrictions partition partition-all
;; TestCases: 
;; (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
;; (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
;; (= (__ 3 (range 8)) '((0 1 2) (3 4 5)))






;; http://www.4clojure.com/problem/55
;; Count Occurrences
;; Difficulty: Medium Topics: seqs core-functions
;; Description: Write a function which returns a map containing the number of occurences of each distinct item in a sequence.  Special Restrictions frequencies
;; TestCases: 
;; (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
;; (= (__ [:b :a :b :a :b]) {:a 2, :b 3})
;; (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
(fn [coll]
  (into {} (map #(vector (key %) (count (val %))) (group-by identity coll))))

;; http://www.4clojure.com/problem/56
;; Find Distinct Items
;; Difficulty: Medium Topics: seqs core-functions
;; Description: Write a function which removes the duplicates from a sequence. Order of the items must be maintained.  Special Restrictions distinct
;; TestCases: 
;; (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
;; (= (__ [:a :a :b :b :c :c]) [:a :b :c])
;; (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
;; (= (__ (range 50)) (range 50))
(fn [coll]
  (sort-by #(.indexOf coll %)
           (keys (group-by identity coll))))

;; http://www.4clojure.com/problem/57
;; Simple Recursion
;; Difficulty: Elementary Topics: recursion
;; Description: A recursive function is a function which calls itself. This is one of the fundamental techniques used in functional programming. 
;; TestCases: 
;; (= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
'(5 4 3 2 1)

;; http://www.4clojure.com/problem/58
;; Function Composition
;; Difficulty: Medium Topics: higher-order-functions core-functions
;; Description: Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function applies them from right-to-left.  Special Restrictions comp
;; TestCases: 
;; (= [3 2 1] ((__ rest reverse) [1 2 3 4]))
;; (= 5 ((__ (partial + 3) second) [1 2 3 4]))
;; (= true ((__ zero? #(mod % 8) +) 3 5 7 9))
;; (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
(fn [& funcs]
  (fn [& args]
    (first (reduce #(vector (apply %2 %1)) args (reverse funcs)))))

;; http://www.4clojure.com/problem/59
;; Juxtaposition
;; Difficulty: Medium Topics: higher-order-functions core-functions
;; Description: Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.  Special Restrictions juxt
;; TestCases: 
;; (= [21 6 1] ((__ + max min) 2 3 5 1 6 4))
;; (= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello"))
;; (= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))

;; http://www.4clojure.com/problem/60
;; Sequence Reductions
;; Difficulty: Medium Topics: seqs core-functions
;; Description: Write a function which behaves like reduce, but returns each intermediate value of the reduction. Your function must accept either two or three arguments, and the return sequence must be lazy.  Special Restrictions reductions
;; TestCases: 
;; (= (take 5 (__ + (range))) [0 1 3 6 10])
;; (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
;; (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

;; http://www.4clojure.com/problem/61
;; Map Construction
;; Difficulty: Easy Topics: core-functions
;; Description: Write a function which takes a vector of keys and a vector of values and constructs a map from them.  Special Restrictions zipmap
;; TestCases: 
;; (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;; (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;; (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
(fn [keys vals]
  [keys vals]
  (loop [map {}
         ks (seq keys)
         vs (seq vals)]
    (if (and ks vs)
      (recur (assoc map (first ks) (first vs))
             (next ks)
             (next vs))
      map)))

;; http://www.4clojure.com/problem/62
;; Re-implement Iterate
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.  Special Restrictions iterate
;; TestCases: 
;; (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])
;; (= (take 100 (__ inc 0)) (take 100 (range)))
;; (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

;; http://www.4clojure.com/problem/63
;; Group a Sequence
;; Difficulty: Easy Topics: core-functions
;; Description: Given a function f and a sequence s, write a function which returns a map. The keys should be the values of f applied to each item in s. The value at each key should be a vector of corresponding items in the order they appear in s.  Special Restrictions group-by
;; TestCases: 
;; (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
;; (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
;;    {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
;; (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
;;    {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

;; http://www.4clojure.com/problem/64
;; Intro to Reduce
;; Difficulty: Elementary Topics: seqs
;; Description: Reduce takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds. 
;; TestCases: 
;; (= 15 (reduce __ [1 2 3 4 5]))
;; (=  0 (reduce __ []))
;; (=  6 (reduce __ 1 [2 3]))
+

;; http://www.4clojure.com/problem/65
;; Black Box Testing
;; Difficulty: Medium Topics: seqs testing
;; Description: Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application. Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given. You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.  Special Restrictions class type Class vector? sequential? list? seq? map? set? instance? getClass
;; TestCases: 
;; (= :map (__ {:a 1, :b 2}))
;; (= :list (__ (range (rand-int 20))))
;; (= :vector (__ [1 2 3 4 5 6]))
;; (= :set (__ #{10 (rand-int 5)}))
;; (= [:map :set :vector :list] (map __ [{} #{} [] ()]))

;; http://www.4clojure.com/problem/66
;; Greatest Common Divisor
;; Difficulty: Easy Topics:
;; Description: Given two integers, write a function which returns the greatest common divisor. 
;; TestCases: 
;; (= (__ 2 4) 2)
;; (= (__ 10 5) 5)
;; (= (__ 5 7) 1)
;; (= (__ 1023 858) 33)
(fn [a b]
  (if (zero? b) a (recur b (mod a b))))

;; http://www.4clojure.com/problem/67
;; Prime Numbers
;; Difficulty: Medium Topics: primes
;; Description: Write a function which returns the first x number of prime numbers. 
;; TestCases: 
;; (= (__ 2) [2 3])
;; (= (__ 5) [2 3 5 7 11])
;; (= (last (__ 100)) 541)
(fn [n]
  (take n (filter #(.isProbablePrime (BigInteger/valueOf %) 5) (iterate inc 2))))

;; http://www.4clojure.com/problem/68
;; Recurring Theme
;; Difficulty: Elementary Topics: recursion
;; Description: Clojure only has one non-stack-consuming looping construct: recur. Either a function or a loop can be used as the recursion point. Either way, recur rebinds the bindings of the recursion point to the values it is passed. Recur must be called from the tail-position, and calling it elsewhere will result in an error. 
;; TestCases: 
;; (= __
;;   (loop [x 5
;;          result []]
;;     (if (> x 0)
;;       (recur (dec x) (conj result (+ 2 x)))
;;       result)))
[7 6 5 4 3]

;; http://www.4clojure.com/problem/69
;; Merge with a Function
;; Difficulty: Medium Topics: core-functions
;; Description: Write a function which takes a function f and a variable number of maps. Your function should return a map that consists of the rest of the maps conj-ed onto the first. If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)  Special Restrictions merge-with
;; TestCases: 
;; (= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
;;    {:a 4, :b 6, :c 20})
;; (= (__ - {1 10, 2 20} {1 3, 2 10, 3 15})
;;    {1 7, 2 10, 3 15})
;; (= (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
;;    {:a [3 4 5], :b [6 7], :c [8 9]})







;; http://www.4clojure.com/problem/70
;; Word Sorting
;; Difficulty: Medium Topics: sorting
;; Description: Write a function that splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored. 
;; TestCases: 
;; (= (__  "Have a nice day.")
;;    ["a" "day" "Have" "nice"])
;; (= (__  "Clojure is a fun language!")
;;    ["a" "Clojure" "fun" "is" "language"])
;; (= (__  "Fools fall for foolish follies.")
;;    ["fall" "follies" "foolish" "Fools" "for"])






;; http://www.4clojure.com/problem/71
;; Rearranging Code: ->
;; Difficulty: Elementary Topics:
;; Description: The -> macro threads an expression x through a variable number of forms. First, x is inserted as the second item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the second item in the second form, making a list of that form if necessary. This process continues for all the forms. Using -> can sometimes make your code more readable. 
;; TestCases: 
;; (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
;;    (-> [2 5 4 1 3 6] reverse rest sort __)
;;    5)







;; http://www.4clojure.com/problem/72
;; Rearranging Code: ->>
;; Difficulty: Elementary Topics:
;; Description: The ->> macro threads an expression x through a variable number of forms. First, x is inserted as the last item in the first form, making a list of it if it is not a list already. Then the first form is inserted as the last item in the second form, making a list of that form if necessary. This process continues for all the forms. Using ->> can sometimes make your code more readable. 
;; TestCases: 
;; (= (__ (map inc (take 3 (drop 2 [2 5 4 1 3 6]))))
;;    (->> [2 5 4 1 3 6] (drop 2) (take 3) (map inc) (__))
;;    11)






;; http://www.4clojure.com/problem/73
;; Analyze a Tic-Tac-Toe Board
;; Difficulty: Hard Topics: game
;; Description: A tic-tac-toe board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e. A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row. Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won. 
;; TestCases: 
;; (= nil (__ [[:e :e :e]
;;             [:e :e :e]
;;             [:e :e :e]]))
;; (= :x (__ [[:x :e :o]
;;            [:x :e :e]
;;            [:x :e :o]]))
;; (= :o (__ [[:e :x :e]
;;            [:o :o :o]
;;            [:x :e :x]]))
;; (= nil (__ [[:x :e :o]
;;             [:x :x :e]
;;             [:o :x :o]]))
;; (= :x (__ [[:x :e :e]
;;            [:o :x :e]
;;            [:o :e :x]]))
;; (= :o (__ [[:x :e :o]
;;            [:x :o :e]
;;            [:o :e :x]]))
;; (= nil (__ [[:x :o :x]
;;             [:x :o :x]
;;             [:o :x :o]]))









;; http://www.4clojure.com/problem/74
;; Filter Perfect Squares
;; Difficulty: Medium Topics:
;; Description: Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares. 
;; TestCases: 
;; (= (__ "4,5,6,7,8,9") "4,9")
;; (= (__ "15,16,25,36,37") "16,25,36")




;; http://www.4clojure.com/problem/75
;; Euler's Totient Function
;; Difficulty: Medium Topics:
;; Description: Two numbers are coprime if their greatest common divisor equals 1. Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x. The special case f(1) equals 1. Write a function which calculates Euler's totient function. 
;; TestCases: 
;; (= (__ 1) 1)
;; (= (__ 10) (count '(1 3 7 9)) 4)
;; (= (__ 40) 16)
;; (= (__ 99) 60)






;; http://www.4clojure.com/problem/76
;; Intro to Trampoline
;; Difficulty: Medium Topics: recursion
;; Description: The trampoline function takes a function f and a variable number of parameters. Trampoline calls f with any parameters that were supplied. If f returns a function, trampoline calls that function with no arguments. This is repeated, until the return value is not a function, and then trampoline returns that non-function value. This is useful for implementing mutually recursive algorithms in a way that won't consume the stack. 
;; TestCases: 
;; (= __
;;    (letfn
;;      [(foo [x y] #(bar (conj x y) y))
;;       (bar [x y] (if (> (last x) 10)
;;                    x
;;                    #(foo x (+ 2 y))))]
;;      (trampoline foo [] 1)))







;; http://www.4clojure.com/problem/77
;; Anagram Finder
;; Difficulty: Medium Topics:
;; Description: Write a function which finds all the anagrams in a vector of words. A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y. Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other. Each sub-set should have at least two words. Words without any anagrams should not be included in the result. 
;; TestCases: 
;; (= (__ ["meat" "mat" "team" "mate" "eat"])
;;    #{#{"meat" "team" "mate"}})
;; (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
;;    #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})






;; http://www.4clojure.com/problem/78
;; Reimplement Trampoline
;; Difficulty: Medium Topics: core-functions
;; Description: Reimplement the function described in "Intro to Trampoline".  Special Restrictions trampoline
;; TestCases: 
;; (= (letfn [(triple [x] #(sub-two (* 3 x)))
;;           (sub-two [x] #(stop?(- x 2)))
;;           (stop? [x] (if (> x 50) x #(triple x)))]
;;     (__ triple 2))
;;   82)
;; (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
;;           (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
;;     (map (partial __ my-even?) (range 6)))
;;   [true false true false true false])

