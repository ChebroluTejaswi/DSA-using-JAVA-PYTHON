def convert(s):
    if s=="":
        return ""
    elif len(s)==1:
        return s.upper()
    else:
        ch=""
        if s[len(s)-2]==" ":
            ch=ch+s[len(s)-1].upper()
        else:
            ch=ch+s[len(s)-1]
        return convert(s[0:len(s)-1])+ch


print(convert("apple is red in color"))