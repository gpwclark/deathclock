# deathclock

something to put in 'ye old i3status bar to help put things in perspective.

## Installation

Download from https://github.com/gpwclark/deathclock

## Usage

Input your death date in the death-date function in core.clj.
To keep it painfully simple this is what I put in ~/.config/i3/i3blocks.conf

```
[deathclock]
command=cd /path/to/the/repo/deathclock && lein run
interval=86400 # is the number of seconds in a day
```

## License

Copyright © 2016 university-of-antarctica

Distributed under the Eclipse Public License
