
//  Definition for a binary tree node.
  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

object Solution {
  def searchBST(root: TreeNode, value: Int): TreeNode = {
    (root, value) match {
      case (null, _) => null
      case (root, value) if root.value == value => root
      case (root, value) if root.value < value => searchBST(root.right, value)
      case (root, value) if root.value > value => searchBST(root.left, value)
    }
  }
}

object _700_Search_in_a_Binary_Search_Tree {

}
