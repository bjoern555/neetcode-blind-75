from typing import List

class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def backtrack(row: int, col: int, word_index: int):
            if row < 0 or row >= len(board) or col < 0 or col >= len(board[0]) or word_index == len(word) or board[row][col] != word[word_index] or board[row][col] == "":
                return False

            if word_index == len(word) - 1:
                return True

            temp = board[row][col]
            board[row][col] = ""

            succeed =  backtrack(row + 1, col, word_index + 1) or backtrack(row - 1, col, word_index + 1) or backtrack(row, col + 1, word_index + 1) or backtrack(row, col - 1, word_index + 1)

            board[row][col] = temp
            return succeed

        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == word[0]:
                    if backtrack(i, j, 0):
                        return True
        return False

if __name__ == "__main__":
    sol = Solution()

    board = [
        ["A", "B", "C", "D"],
        ["S", "A", "A", "T"],
        ["A", "C", "A", "E"]
    ]
    word = "CAT"
    print(f"Ex 1: {sol.exist(board, word)}")

    board = [
        ["A", "B", "C", "D"],
        ["S", "A", "A", "T"],
        ["A", "C", "A", "E"]
    ]
    word = "BAT"
    print(f"Ex 1: {sol.exist(board, word)}")