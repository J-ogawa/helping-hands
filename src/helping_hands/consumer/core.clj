(ns helping-hands.consumer.core
  "Initializes Helping Hands Consumer Service"
  (:require [cheshire.core :as jp]
            [clojure.string :as s]
            [helpinf-hands.consumer.persistence :as p]
            [io.pedestal.interceptor.chain :as chain])
  (:import [java.id IOException]
           [java.util UUID]))

(def ^:private cunsumerdb
  (delay (p/create-
