# B Tree Index implementation in Python
### This implementation is based on the article [_"The Case for Learned Index Structures"_](https://arxiv.org/pdf/1712.01208.pdf)

The following application is an example for using B-Tree index. We are going to have a sorted array with a fixed size. Based on this array we will create a B-Tree. The scope is to find a specific key in the array using the B-tree.

Observation:
- a node in the B-tree is <key, value> where key =  is the key we are looking for and value = is the page number where the key exist

Database = is just a simple array in this example

### How to test the program:
1. Import as a maven project in Eclipse
2. Run the application App.java

Example: 
- in the main method, we are generating just for example, an sorted array like:
6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 
26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 
45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 
66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 
88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 

- then we are trying to find key = 19, in this sorted array.
- we assumed that every records it's in a page, where a page_size = 4
key -> B-tree -> poz,   poz = the position of a page, where the key exist.
- after we got the page, using the binary_search algorithm we are looking for that key in the page.

The result will be:
12
13 -> the pozition where the key is in the sorted-array
