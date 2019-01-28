(defn parse-int [s]
  (Integer/parseInt (re-find #"\A-?\d+" s)))

(defn revers [n]
  (parse-int (apply str (reverse (str n))))) 

(defn is-pal? [n]
  (= 0 (- n (revers n))))

(defn three-digit-products []
  (for [x (range 1 1000) y (range x 1000)] (* x y)))

(defn largest-pal []
  (apply max (filter is-pal? (three-digit-products))))

(println (largest-pal))
