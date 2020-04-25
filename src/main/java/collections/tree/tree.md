# Tree
- A Collection of entities - "Nodes" connected by "Edges"
- Each Node can contain value and it may or may not have a child node
- Leaf nodes - Nodes without childres

#### Terminology summary :
* Root is the topmost node of the tree
* Edge is the link between two nodes
* Child is a node that has a parent node
* Parent is a node that has an edge to a child node
* Leaf is a node that does not have a child node in the tree
* Height is the length of the longest path to a leaf
* Depth is the length of the path to its root

####  Height of tree
* Empty tree = -1
* Single node = 0

####  Depth of a Tree
* length of the path to the root


####  Differernt Types of Tree
* Binary Tree
* Sorted Binary Tree
* AVL - Always rotate for an insertion
* red black tree - max rotations is 2

````
                  1
               /     \
             2         5
           /   \      /   \
          3     4    6      7
````
### Tree Traversal :
#### DFS :
 * is an algorithm for traversing or searching tree data structure.
 * One starts at the root and explores as far as possible along each branch before backtracking.
 * Implemented using Linked List

##### Types of DFS :
1. Pre-order : `1–2–3–4–5–6–7`
   - Print the value of the node.
   - Go to the left child and print it. This is if, and only if, it has a left child.
   - Go to the right child and print it. This is if, and only if, it has a right child.
2. In Order : `3–2–4–1–6–5–7`
   - Go to the left child and print it. This is if, and only if, it has a left child.
   - Print the node’s value
   - Go to the right child and print it. This is if, and only if, it has a right child.
3. Post - Order : `3–4–2–6–7–5–1`
   - Go to the left child and print it. This is if, and only if, it has a left child.
   - Go to the right child and print it. This is if, and only if, it has a right child.
   - Print the node’s value


#### BFS : `1–2–5–3–4–6–7`
- BFS algorithm traverses the tree level by level and depth by depth.
- Implemented using Queue

  * Traversal :
    * First add the root node into the queue with the put method.
    * Iterate while the queue is not empty.
    * Get the first node in the queue, and then print its value.
    * Add both left and right children into the queue (if the current nodehas children).
    * Done. We will print the value of each node, level by level, with our queuehelper.
