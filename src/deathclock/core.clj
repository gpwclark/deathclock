(ns deathclock.core
  (:gen-class)
  (:require [clj-time.core :as t]))

(def days-in-year 365)

(def mins-in-day 1440)

(defn death-date []
  "It's all a joke anyway"
  (t/date-time 2064 04 01))

(defn curr-time []
  "right now!"
  (t/now))

(defn minutes-until-death []
  (t/in-minutes (t/interval (curr-time) (death-date))))

(defn days-until-death []
  (/ (minutes-until-death) mins-in-day))

(defn years-until-death []
  (/ (days-until-death) days-in-year))

(defn days-until-death-less-years []
  (mod (days-until-death) days-in-year))

(defn -main []
  (print "DEATH IN " (int (years-until-death)) " YRS & " (int (days-until-death-less-years)) " DAYS"))
