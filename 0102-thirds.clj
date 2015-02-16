; Give two implementations of third, that return the third element of a list

(def my-third (fn [list] (nth list 2)))

(def my-other-third (fn [list] (first (rest (rest list)))))

