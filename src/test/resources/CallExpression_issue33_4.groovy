1 + 1.("a" + "1")()
1 + 1.(m())()
1.("a" + "1")()
1.("a" + "1")(123)
1.("a" + "1") 123
1.(m())()
1.(m())(123)
1.(m()) 123
(1+1).("a"+1)()
(1+1).("a"+1) a b c
1+1.("a"+1)()

x = a(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = a(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}
x = obj.a(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = obj.a(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}
x = {a, b -> }(1, 2)(3, 4) {} {} (5, 6) {} (7, 8)
x = {a, b -> }(1, 2) {} (3, 4) {} {} (5, 6) {} (7, 8) {}
x = {a, b -> }(1, 2) {} {} (3, 4) {} {} (5, 6) {} (7, 8) {} {}