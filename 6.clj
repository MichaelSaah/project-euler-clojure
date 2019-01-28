(defn square [x]
  (int (Math/pow x 2)))

(defn sum-squares [n]
  (apply + (map square (range 1 (inc n)))))

(defn square-sums [n]
  (square (apply + (range 1 (inc n)))))

(defn difference [n]
  (- (square-sums n) (sum-squares n)))

(println (difference 100))
