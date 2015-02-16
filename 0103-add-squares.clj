; Implement an add-squares function that returns the sum of the squares of the arguments

(def square (fn [x] (* x x)))

(def add-squares (fn [& numbers] (reduce + (map square numbers))))
