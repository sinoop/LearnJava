# import unittest
#
# from product import get_product, get_product_no_division
#
# tests = [
#     {'test': [1, 2, 3, 4, 5], 'result': [120, 60, 40, 30, 24]},
#     {'test': [3, 2, 1], 'result': [2, 3, 6]},
#     {'test': [0, 1, 2], 'result': [2, 0, 0]},
#     {'test': [0, 0, 1], 'result': [0, 0, 0]},
# ]
#
#
# class TestStringMethods(unittest.TestCase):
#     def products(list):
#         p = 1
#         pn = 1
#         nz = 0
#         for i in list:
#             p *= i
#             if i != 0:
#                 pn *= i
#             else:
#                 nz += 1
#         return (p, pn, nz)
#
#     def get_product(l):
#         p, pn, nz = products(l)
#
#         if nz == 0:
#             return [p // e for e in l]
#         elif nz == 1:
#             return [(p // e if e != 0 else pn) for e in l]
#         else:
#             return [0 for _ in l]
#
#     def get_product_no_division(l):
#         return [product(list(l[:i] + l[i + 1:])) for i in range(0, len(l))]
#
#     def test_get_product(self):
#         for t in tests:
#             self.assertEqual(get_product(t['test']), t['result'])
#
#     def test_get_product_no_division(self):
#         for t in tests:
#             self.assertEqual(get_product_no_division(t['test']), t['result'])
#
#     def test_compare_products(self):
#         for t in tests:
#             print(t['test'])
#             self.assertEqual(get_product(t['test']), get_product_no_division(t['test']))
#
#
# if __name__ == '__main__':
#     unittest.main()
