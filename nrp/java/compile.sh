rm -rf "vaja$1"
mkdir "vaja$1"
javac -d "vaja$1" Vaja.java
cp Vaja.java "vaja$1/Vaja.java.txt"
cd "vaja$1"
java Vaja $2 $3