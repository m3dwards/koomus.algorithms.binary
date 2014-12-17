(ns koomus.algorithms.binary-test
  (:require [clojure.test :refer :all]
            [koomus.algorithms.binary :refer :all]
            [midje.sweet :refer :all]))


(fact "single pixel should turn black"
  (binary-convert 2r0) => 2r1   
  
  )
