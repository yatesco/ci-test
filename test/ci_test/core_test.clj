(ns ci-test.core-test
  (:require [clojure.test :refer :all]
            [ci-test.core :refer :all]))

(deftest a-test
  (testing "a simple test"
    (is (= 0 0))
    (is (= 1 1))
    (is (= 2 2))
