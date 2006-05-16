# For complete documentation of this file, please see Geany's main documentation
[styling]
# foreground;background;bold;italic
default=0x000000;0xffffff;false;false
comment=0x0000ff;0xffffff;false;false
commentline=0x0000ff;0xffffff;false;false
commentdoc=0x0000ff;0xffffff;false;false
number=0x007f00;0xffffff;false;false
word=0x991111;0xffffff;true;false
word2=0x00007F;0xffffff;true;false
string=0x1E90FF;0xffffff;false;false
character=0x1E90FF;0xffffff;false;false
uuid=0x804040;0xffffff;false;false
preprocessor=0x7F7F00;0xffffff;false;false
operator=0x101030;0xffffff;false;false
identifier=0x004040;0xffffff;false;false
stringeol=0x000000;0xe0c0e0;false;false
verbatim=0x906040;0x0000ff;false;false
regex=0x905010;0xffffff;false;false
commentlinedoc=0x0000ff;0xffffff;true;true
commentdockeyword=0x0000ff;0xffffff;true;true
globalclass=0x109040;0xffffff;true;false

[keywords]
primary=abstract assert break case catch class const continue default do else extends final finally for future generic goto if implements import inner instanceof interface native new outer package private protected public rest return static super switch synchronized this throw throws transient try var volatile while
secondary=boolean byte char double float int long null short void NULL
doccomment=return param author
typedefs=


[settings]
# the following characters are these which a "word" can contains, see documentation
wordchars=_#&abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789

# if only single comment char is supported like # in this file, leave comment_close blank
comment_open=/*
comment_close=*/

# set to false if a comment character/string should start a column 0 of a line, true uses any
# indention of the line, e.g. setting to true causes the following on pressing CTRL+d
	#command_example();
# setting to false would generate this
#	command_example();
# This setting works only for single line comments
comment_use_indent=true


[build_settings]
# %f will be replaced by the complete filename
# %e will be replaced by the filename without extension
# (use only one of it at one time)
compiler=javac "%f"
run_cmd=java "%e"
